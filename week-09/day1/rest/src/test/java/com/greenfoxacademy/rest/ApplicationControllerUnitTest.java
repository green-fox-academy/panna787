package com.greenfoxacademy.rest;

import com.greenfoxacademy.rest.controllers.ApplicationController;
import com.greenfoxacademy.rest.models.Appended;
import com.greenfoxacademy.rest.models.DoubledNumber;
import com.greenfoxacademy.rest.models.Greeting;
import com.greenfoxacademy.rest.models.InputError;
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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ApplicationController.class)
public class ApplicationControllerUnitTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    ApplicationService service;

    @Test
    public void getDoubledNumber_ReceivesInput_ReturnsDoubledNumber_IsOk() throws Exception{
        when(service.doubleNumber(eq(5)))
                .thenReturn(new DoubledNumber(5, 10));

        mockMvc.perform(get("/doubling?input=5"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.received")
                .value(5))
                .andExpect(MockMvcResultMatchers.jsonPath("$.result")
                .value(10))
                .andExpect(status().isOk());
    }

    @Test
    public void showErrorMessage_AtDoubledNumber_WithoutInput_ReturnsErrorMessage() throws Exception {
        when(service.showErrorMessage("Please provide an input!"))
                .thenReturn(new InputError("Please provide an input!"));

        mockMvc.perform(get("/doubling"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.error")
                .value("Please provide an input!"))
                .andExpect(status().isOk());
    }

    @Test
    public void showGreeting_ReceivesNameAndTitle_ReturnsGreeting_IsOk() throws Exception {
        when(service.showGreeting("Petike", "student"))
                .thenReturn(new Greeting("Oh, hi there Petike, my dear student!"));

        mockMvc.perform(get("/greeter?name=Petike&title=student"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.welcome_message")
                .value("Oh, hi there Petike, my dear student!"))
                .andExpect(status().isOk());
    }

    @Test
    public void showAppendedWord_ReturnsAppended_IsOk() throws Exception {
        when(service.appendAToString("macsk"))
                .thenReturn(new Appended("macska"));

        mockMvc.perform(get("/appenda/macsk"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.appended")
                .value("macska"))
                .andExpect(status().isOk());
    }
}
