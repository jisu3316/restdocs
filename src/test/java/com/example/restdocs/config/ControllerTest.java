package com.example.restdocs.config;

import com.example.restdocs.service.MemberService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Disabled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@Disabled
public abstract class ControllerTest {

    @Autowired protected ObjectMapper objectMapper;

    @Autowired protected MockMvc mockMvc;

    @MockBean protected MemberService memberService;

    protected String createJson(Object dto) throws JsonProcessingException {
        return objectMapper.writeValueAsString(dto);
    }
}