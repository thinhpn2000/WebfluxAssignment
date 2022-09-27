package com.assignment.controller;

import com.assignment.blockhound.SomeThingBlocking;
import com.assignment.entity.User;
import com.assignment.service.UserService;
import com.assignment.utils.ApiConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.blockhound.BlockHound;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;

import java.util.zip.InflaterInputStream;

@RestController
@RequestMapping(ApiConstant.API_USER)
public class UserController {

    @Autowired
    private UserService userService;

    @PreAuthorize("hasRole('EMPLOYEE')")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<User> getAllUser(){
        SomeThingBlocking someThingBlocking = new SomeThingBlocking();
        someThingBlocking.printBlocking();
        Object userDetails = ReactiveSecurityContextHolder.getContext();
        return userService.findAll();
    }
}
