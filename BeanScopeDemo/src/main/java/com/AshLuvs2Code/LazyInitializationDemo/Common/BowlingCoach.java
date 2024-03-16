package com.AshLuvs2Code.LazyInitializationDemo.Common;

import org.springframework.stereotype.Component;

@Component
public class BowlingCoach implements Coach{

    public BowlingCoach(){
        System.out.println("Inside BowlingCoach constructor and created a instance for it in Heap..!");
    }

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Practice bowling for 40 mins everyday..!";
    }
}
