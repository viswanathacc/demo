package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.demo.repository")
@EntityScan("com.example.demo.model")
@SpringBootApplication // covers config/enable auto config/component scan
@EnableCaching  // Informs spring to support cache
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class,args);
	}

}