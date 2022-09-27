package com.assignment;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.blockhound.BlockHound;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API document for assignment", version = "1.0", description = "Documentation APIs v1.0"))
public class AssignmentApplication {
	public static void main(String[] args) {
		BlockHound.install();
		SpringApplication.run(AssignmentApplication.class, args);
	}

}
