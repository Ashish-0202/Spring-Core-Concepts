package com.springcore.InjectionWithMultipleBeans.Commons;

import org.springframework.stereotype.Component;

//@Component will mark a class as a bean and makes it available for dependency injection
@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling for 45 min everyday";
    }
}
