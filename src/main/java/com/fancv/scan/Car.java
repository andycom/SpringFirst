package com.fancv.scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author hamish-wu
 */
@ComponentScan
@Component("minCar")
public class Car {

    private String name = "car name";

    public void driver() {
        System.out.println(this.name);
    }
}
