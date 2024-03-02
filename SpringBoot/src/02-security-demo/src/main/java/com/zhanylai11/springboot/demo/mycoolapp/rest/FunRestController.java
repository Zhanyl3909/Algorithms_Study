package com.zhanylai11.springboot.demo.mycoolapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FunRestController {
    @GetMapping("/")
    public String sayHello() {
        return ("Hello World");
    }

    @GetMapping("/workout")
    public String workoutDaily() {
        return ("Do workout daily for your body");
    }
}
