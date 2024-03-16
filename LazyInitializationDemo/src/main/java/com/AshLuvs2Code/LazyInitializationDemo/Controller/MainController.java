package com.AshLuvs2Code.LazyInitializationDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AshLuvs2Code.LazyInitializationDemo.Common.Coach;

@RestController
public class MainController {
    
    //Define a private method for dependency
    private Coach thecoach;

    //This will tell spring to inject a dependency
    @Autowired
    public MainController(@Qualifier("swimCoach") Coach coach){
        thecoach=coach;
    }

    @GetMapping("/getWorkout")
    public String getDailyWorkout(){
        return thecoach.getDailyWorkout();
    }
}
