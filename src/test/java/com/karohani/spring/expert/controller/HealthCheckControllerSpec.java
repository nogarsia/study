package com.karohani.spring.expert.controller;

import com.karohani.spring.expert.service.HealthService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*
    Container가 관리해주는 Bean을 가지고 하는 테스트
    junit run aa.java -> @RunWith(SpringBootTestRunner.class)

 */
@SpringBootTest
public class HealthCheckControllerSpec {

    @SpyBean
    private HealthCheckController healthCheckController;

    @Mock
    private HealthService healthService;
    /*
        HTTP -> Servlet이라는 걸로 추상화

       serverlet reuqest -> (servlet container) -> reponse

     */
    private MockMvc mockMvc;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(healthCheckController).build();
    }

    @Test
    @DisplayName("context: rest-api를 테스트해보자")
    public void test1() throws Exception {
        // when
        when(healthService.health()).thenReturn("alijalsijefliajsfe");

        System.out.println(healthService);

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/api/ping");
        mockMvc.perform(request).andExpect(status().isOk()).andDo(print());

    }
}
