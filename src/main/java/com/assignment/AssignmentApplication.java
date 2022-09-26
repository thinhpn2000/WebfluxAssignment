package com.assignment;

import com.assignment.blockhound.MyBlockhoundIntegration;
import com.assignment.blockhound.SomeThingBlocking;
import com.assignment.controller.UserController;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.blockhound.BlockHound;
import reactor.blockhound.integration.BlockHoundIntegration;

import java.util.zip.InflaterInputStream;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API document for assignment", version = "1.0", description = "Documentation APIs v1.0"))
public class AssignmentApplication {
	public static void main(String[] args) {
//		BlockHound.install(b -> {
//			b.markAsBlocking(SomeThingBlocking.class,"printBlocking","()V");
//			b.allowBlockingCallsInside(InflaterInputStream.class.getName(), "read");
//		});
		BlockHound.install();
		SpringApplication.run(AssignmentApplication.class, args);
	}

}
