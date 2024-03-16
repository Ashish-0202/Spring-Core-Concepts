package com.AshLuvs2Code.LazyInitializationDemo.Common;

import org.springframework.stereotype.Component;


@Component
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("Inside CricketCoach constructor and created a instance for it in Heap..!");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice batting for 35 mins everyday..!";
    }
}
