package com.karohani.spring.expert.controller;

import com.karohani.spring.expert.service.HealthService;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HealthCheckController {

    private final HealthService healthService;

    @GetMapping("/api/ping")
    public String healthCheck() {
        return healthService.health();
    }
}
