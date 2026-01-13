package com.fitness.activityservice.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.stereotype.Component;

@Component
public class MongoDebug {

    @Autowired
    private MongoDatabaseFactory mongoDatabaseFactory;

    @PostConstruct
    public void checkDb() {
        System.out.println("🚨 Mongo DB IN USE = " +
                mongoDatabaseFactory.getMongoDatabase().getName());
    }
}
