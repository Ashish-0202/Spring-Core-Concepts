package com.springcore.JavaConfigBean.Commons;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Practice Speed bowling everyday..!";
    }
}
