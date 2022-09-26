package com.assignment.controller;

import com.assignment.entity.User;
import com.assignment.security.auth.AuthRequest;
import com.assignment.security.auth.AuthResponse;
import com.assignment.security.auth.JWTUtil;
import com.assignment.service.UserService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.blockhound.BlockHound;
import reactor.blockhound.BlockingOperationError;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class AuthControllerTest {

    @InjectMocks
    private AuthController authController;
    @Mock
    private JWTUtil jwtUtil;
    @Mock
    private UserService userService;
    @BeforeAll
    public static void BlockHoundSetUp(){
        BlockHound.install();
    }
    @Test
    public void blockHoundWorks() {
        try {
            FutureTask<?> task = new FutureTask<>(() -> {
                Thread.sleep(0);
                return "";
            });
            Schedulers.parallel().schedule(task);

            task.get(10, TimeUnit.SECONDS);
            Assert.fail("should fail");
        } catch (ExecutionException e) {
            Assert.assertTrue("detected", e.getCause() instanceof BlockingOperationError);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
    }

    User user = new User("id_test", "Test Name", "test@gmail.com", "password_test", "ROLE_TEST");

    @BeforeEach
    void setUp() {
        BDDMockito.when(userService.findByEmail("test@gmail.com"))
                .thenReturn(Mono.just(user));
    }

    @Test
    void login() throws InterruptedException {
        Thread.sleep(1000);
        AuthRequest authRequest = new AuthRequest("test@gmail.com","password_test");
        Mono<ResponseEntity<AuthResponse>> response = authController.login(authRequest);
        Assert.assertNotNull(response);
    }
}