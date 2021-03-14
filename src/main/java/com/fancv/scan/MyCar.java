package com.fancv.scan;

import com.fancv.spring.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyCar {

    @Autowired
    @Qualifier("minCar")
    Car min;

    @Autowired
    HelloWorld helloWorld;


    public void myDriver() {
        System.out.println("MyDriver start...");
        min.driver();
        helloWorld.getMessage();

    }


}
