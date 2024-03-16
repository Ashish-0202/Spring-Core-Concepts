package com.AshLuvs2Code.LazyInitializationDemo.Common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//The prototype scope indicates that a new instance of the bean will be created each time it is requested and also it will make other classes as Lazy by default
@Scope("prototype")
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
