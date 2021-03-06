package com.fancv.scan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
@ImportResource("classpath:cd-config.xml")
public class MyDisk {

    @Bean(name = "minCar")
    @Conditional(MyCondition.class)
    public Car getCar() {
        return new Car();
    }
}
