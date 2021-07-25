package com.example.selenideFw.entity;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class CommonConfig {
    @Value("${browser}")
    private String browser;

    @Value("${hubip}")
    private String hubip;

    @Value("${headless}")
    private Boolean headless;

    @Value("${windowsize}")
    private String windowSize;
}
