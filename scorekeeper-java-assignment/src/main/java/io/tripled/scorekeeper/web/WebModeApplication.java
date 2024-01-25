package io.tripled.scorekeeper.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebModeApplication {

    public static void main(String[] args) {
        runWebApp(args);
    }

    public static void runWebApp(String[] args) {
        SpringApplication.run(WebModeApplication.class, args);
    }
}
