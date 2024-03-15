package com.springcore.InjectionWithMultipleBeans.Commons;

import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Practice Running with Shoes for 45 Mins everyday..!";
    }
    
}
