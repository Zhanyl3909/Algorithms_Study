package com.zhanylai11.springcoredemo.rest;

import com.zhanylai11.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public void DemoController(
            @Qualifier("tennisCoach") Coach thisCoach,
            @Qualifier("tennisCoach") Coach theAnotherCoach)
    {
        System.out.println("In Constructor: " + getClass().getSimpleName());

        myCoach = thisCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String dailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans myCoach == anotherCoach: " + (myCoach==anotherCoach);
    }

}
