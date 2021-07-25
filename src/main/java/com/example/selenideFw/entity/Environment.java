package com.example.selenideFw.entity;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Environment {



    @Value("${url}")
    private String url;

    @Value("${marsuser}")
    private String marsuser;

    @Value("${marsuserpassword}")
    private String marsuserpassword;

    @Value("${mongodb.url}")
    private String mongoDbUrl;

    @Value("${mongodb.port}")
    private int mongoDbPort;

    @Value("${mongodb.database}")
    private String mongoDbDatabase;

}
