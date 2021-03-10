package com.fancv.scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
@Component
public class Car {

    private String name = "car name";

    public void driver() {
        System.out.println(this.name);
    }

    public void Mydriver(String name) {
        System.out.println(this.name);

    }
}
