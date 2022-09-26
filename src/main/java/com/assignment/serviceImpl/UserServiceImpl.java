package com.assignment.serviceImpl;

import com.assignment.entity.User;
import com.assignment.repository.UserRepository;
import com.assignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Flux<User> findAll() {
        return userRepository.findAll();
     //   return userRepository.findAllByCallProcedure();
    }

    @Override
    public Mono<User> findByEmail(String email) {
        return  userRepository.findByEmail(email);
    }
}
