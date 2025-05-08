package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Testklasse für die Spring Boot Anwendung.
 */
@SpringBootTest
@AutoConfigureMockMvc
class HelloMcpExampleApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Testet, ob der Kontext korrekt geladen wird.
     */
    @Test
    void contextLoads() {
    }

    /**
     * Testet den Hello-Endpunkt.
     */
    @Test
    void helloEndpointReturnsCorrectMessage() throws Exception {
        mockMvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hello MCP Example World from Spring Boot!"));
    }
}