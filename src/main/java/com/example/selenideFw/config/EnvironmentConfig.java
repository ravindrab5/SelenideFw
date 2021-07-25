package com.example.selenideFw.config;


import com.example.selenideFw.entity.Environment;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@ComponentScan(basePackages = {"com.example.selenideFw.*"})
@EnableMongoRepositories("com.example.selenideFw.repositories")
@PropertySources({
        @PropertySource("classpath:Properties/${env}.properties"),
        @PropertySource("classpath:Properties/commonconfig.properties")
}
)
public class EnvironmentConfig {

    @Autowired
    Environment environment;

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {

        MongoClient mongoClient = new MongoClient(environment.getMongoDbUrl(), environment.getMongoDbPort());
        UserCredentials userCredentials = new UserCredentials("", "");
        return new SimpleMongoDbFactory(mongoClient, environment.getMongoDbDatabase(), userCredentials);

    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {

        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;

    }
}
