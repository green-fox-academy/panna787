package com.greenfoxacademy.rest;

import com.greenfoxacademy.rest.controllers.ApplicationController;
import com.greenfoxacademy.rest.models.DoubledNumber;
import com.greenfoxacademy.rest.services.ApplicationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(ApplicationController.class)
public class ApplicationControllerUnitTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    ApplicationService service;

    @Test
    public void getDoubledNumber_ReturnsDoubledNumber_IsOk() throws Exception{
        when(service.doubleNumber(eq(5)))
                .thenReturn(new DoubledNumber(5, 10));

        mockMvc.perform(get("/doubling?input=5"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.received")
                .value(5))
                .andExpect(MockMvcResultMatchers.jsonPath("$.result")
                        .value(10));

    }


}
