package com.fancv.scan;

import org.springframework.context.annotation.Conditional;

@Conditional(MyCondition.class)
public class Cat {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
