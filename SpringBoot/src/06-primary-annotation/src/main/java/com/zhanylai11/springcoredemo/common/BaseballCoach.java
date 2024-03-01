package com.zhanylai11.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice baseball for 30 min!!";
    }
}
