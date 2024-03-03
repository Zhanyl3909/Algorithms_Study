package com.zhanylai11.springcoredemo.rest;

import com.zhanylai11.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public void DemoController(@Qualifier("tennisCoach") Coach thisCoach) {
        System.out.println("In Constructor: " + getClass().getSimpleName());
        myCoach = thisCoach;
    }

    @GetMapping("/dailyworkout")
    public String dailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
