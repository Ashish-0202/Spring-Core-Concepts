package com.springcore.JavaConfigBean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springcore.JavaConfigBean.Commons.Coach;
import com.springcore.JavaConfigBean.Commons.SwimCoach;

@Configuration
public class BeanConfig {
    
    @Bean("swimCoach")
    Coach theCoach(){
        return new SwimCoach();
    }

}
