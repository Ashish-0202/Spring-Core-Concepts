package com.AshLuvs2Code.LazyInitializationDemo.Common;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("Inside Swimacoach constructor and created a instance for it in Heap..!");
    }

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Practice swimming for 1hr every morning..!";
    }
}
