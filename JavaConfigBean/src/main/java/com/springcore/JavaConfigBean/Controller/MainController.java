package com.springcore.JavaConfigBean.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcore.JavaConfigBean.Commons.Coach;

@RestController
public class MainController {
    
    private Coach thecoach;

    @Autowired
    public MainController(@Qualifier("cricketCoach") Coach coach){
        thecoach=coach;
    }

    @GetMapping("/get")
    public String getDailyWorkout(){
        return thecoach.getDailyWorkout();
    }
}
