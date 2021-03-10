package com.fancv.spring;

public class House {


    private String name;

    private String clour;

    public House(String name, String clour) {
        this.name = name;
        this.clour = clour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClour() {
        return clour;
    }

    public void setClour(String clour) {
        this.clour = clour;
    }
}
