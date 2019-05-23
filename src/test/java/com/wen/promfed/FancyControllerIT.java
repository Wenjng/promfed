package com.wen.promfed;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@ContextConfiguration(classes = {FancyController.class})
@WebMvcTest
class FancyControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getHelloMessage() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/hello")
                .with(user("user123"))
                .with(csrf())
                .contentType(MediaType.TEXT_PLAIN)
                .accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andReturn();
        assertEquals("Hello WebFlux", result.getResponse().getContentAsString());
    }
}