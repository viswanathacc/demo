package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest()
public class SpringBootstrapLiveWebTestClientIT {

    @Test
    public void exampleTest() {

        WebTestClient.bindToServer().baseUrl("http://localhost:8082")
                .build().get().uri("/api/books").exchange().expectStatus().isOk().expectBody().json("[]");
    }
}

