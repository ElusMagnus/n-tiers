package com.example.n_tiers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class NTiersApplication {

    public static void main(String[] args) {
        SpringApplication.run(NTiersApplication.class, args);
    }

    @RestController
    class NTiersController {
        
        @GetMapping("/hello")
        public String hello() {
            return "Hello, World!";
        }
    }
}
