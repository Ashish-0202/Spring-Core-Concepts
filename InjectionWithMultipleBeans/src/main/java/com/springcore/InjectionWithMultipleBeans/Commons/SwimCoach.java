package com.springcore.InjectionWithMultipleBeans.Commons;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Practice swimming for 30 mins a day...!";
    }    
}
