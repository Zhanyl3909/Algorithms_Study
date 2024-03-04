package com.zhanylai11.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice tennis for 30 min!!";
    }

    @PostConstruct
    public void doLeetCode() {
        System.out.println("In DoLeetCode() " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doLeetCodes() {
        System.out.println("In DoLeetCodes() " + getClass().getSimpleName());
    }

}
