package com.jar.call;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContainJarAsDependencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainJarAsDependencyApplication.class, args);
	}
	
	@GetMapping("/")
	public ResponseEntity<String> print() {
		return ResponseEntity.ok().body("ping success");
	}

}
