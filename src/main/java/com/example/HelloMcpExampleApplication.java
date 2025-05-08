package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot Hauptanwendung.
 */
@SpringBootApplication
public class HelloMcpExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloMcpExampleApplication.class, args);
        System.out.println("Hello MCP Example Spring Boot Application is running!");
    }

    /**
     * Controller für die REST API.
     */
    @RestController
    static class HelloController {
        
        /**
         * Einfacher Endpunkt, der eine Begrüßungsnachricht zurückgibt.
         * 
         * @return Begrüßungsnachricht
         */
        @GetMapping("/")
        public String hello() {
            return "Hello MCP Example World from Spring Boot!";
        }
    }
}