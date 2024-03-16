package com.AshLuvs2Code.LazyInitializationDemo.Common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Note if you mark this class as @Lazy then it will not create ist instance unless it is needed or called.(Ex the constructor wont be invoked when application is started)
@Component
@Lazy
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("Inside Swimacoach constructor and created a instance for it in Heap..!");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice batting for 35 mins everyday..!";
    }
}
