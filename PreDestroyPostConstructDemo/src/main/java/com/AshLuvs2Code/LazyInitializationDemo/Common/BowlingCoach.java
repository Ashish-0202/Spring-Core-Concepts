package com.AshLuvs2Code.LazyInitializationDemo.Common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class BowlingCoach implements Coach{

    public BowlingCoach(){
        System.out.println("Inside BowlingCoach constructor and created a instance for it in Heap..!");
    }

    @PostConstruct
    public void DemoConstruct(){
        System.out.println("Inside Bowling coach and Constructed using post Construct");
    }

    @PreDestroy
    public void Demodestroy(){
        System.out.println("Inside Bowling coach and Destroying using pre destroy in the class: " +getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Practice bowling for 40 mins everyday..!";
    }
}
