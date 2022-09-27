package com.assignment.controller;

import com.assignment.security.auth.AuthRequest;
import com.assignment.security.auth.AuthResponse;
import com.assignment.security.auth.JWTUtil;
import com.assignment.service.UserService;
import com.assignment.utils.ApiConstant;
import org.mockito.cglib.core.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JWTUtil jwtUtil;


    @PostMapping(value = ApiConstant.API_AUTHENTICATION_LOGIN)
    public Mono<ResponseEntity<AuthResponse>> login(@RequestBody AuthRequest authRequest) throws InterruptedException {
        return userService.findByEmail(authRequest.getUsername())
                .filter(userDetails-> authRequest.getPassword().equals(userDetails.getPswd()))
                .map(userDetails -> ResponseEntity.ok(new AuthResponse(jwtUtil.generateToken(userDetails))))
                .switchIfEmpty(Mono.just(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()));
    }
}
