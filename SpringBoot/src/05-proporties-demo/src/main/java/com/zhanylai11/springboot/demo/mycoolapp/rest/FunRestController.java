package com.zhanylai11.springboot.demo.mycoolapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FunRestController {
    //injecting my properties
    @Value("${team.name}")
    private String teamName;

    @Value("${coach.name}")
    private String coachName;

    //expose new endpoint for team info
    @GetMapping("/teaminfo")
    public String teamInfo() {
        return "Coach name: " + coachName + ",Team name: " + teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        return ("Hello World");
    }

    @GetMapping("/workout")
    public String workoutDaily() {
        return ("Do workout daily for your body");
    }
}
