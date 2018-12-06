package com.example.herokupipeexample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.logz.logback.LogzioLogbackAppender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Greeting {
    Logger logger = LoggerFactory.getLogger(LogzioLogbackAppender.class);


    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        logger.info("A greeting was just made.");

        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
