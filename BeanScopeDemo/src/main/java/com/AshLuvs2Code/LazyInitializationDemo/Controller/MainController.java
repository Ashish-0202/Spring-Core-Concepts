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

    //Here We will inject depedency from a same bean and by default it will create the both both the object in same reference
    private Coach thenewCoach;

    //This will tell spring to inject a dependency
    @Autowired
    public MainController(@Qualifier("swimCoach") Coach coach,@Qualifier("swimCoach") Coach seccoaCoach){
        thecoach=coach;
        thenewCoach=seccoaCoach;
    }

    @GetMapping("/getWorkout")
    public String getDailyWorkout(){
        return thecoach.getDailyWorkout();
    }

    //http://localhost:8080/Check Use this URL to check before and after marking a scope as prototype in SwimCoach.java file
    @GetMapping("/Check")
    public String checkReference(){
        if(thecoach==thenewCoach){
            return "Yes, Both the objects are in same memeory reference..!";
        }else{
            return "Oops..! both the object are in different reference because of the scope type is prototype and The prototype scope indicates that a new instance of the bean will be created each time it is requested. ";
        }
    }
}
