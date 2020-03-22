package com.karohani.spring.expert.service;

import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public String health() {
        return "health";
    }
}
