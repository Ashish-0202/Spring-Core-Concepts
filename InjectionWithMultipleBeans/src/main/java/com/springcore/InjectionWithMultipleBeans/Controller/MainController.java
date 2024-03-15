package com.springcore.InjectionWithMultipleBeans.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcore.InjectionWithMultipleBeans.Commons.Coach;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MainController {

//Defining a private field for Dependency
private Coach thecoach;

//@Autowired will tell spring to inject a dependency
//If you have only one component/bean/class then it is easy to inject a dependency but if you have multiple then you need to use @Qualifier('beanName')

@Autowired
public MainController(@Qualifier("swimCoach") Coach coach){
    thecoach = coach;
}

@GetMapping("/getDailyWorkout")
public String getDailyWorkout(){
    return thecoach.getDailyWorkout();
}

}
