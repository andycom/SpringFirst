package com.fancv.spring;

/**
 *
 */
public class HelloWorld {


    private String message;

    private int age;


    public HelloWorld() {

    }

    public HelloWorld(String message, int age) {
        this.message = message;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }
}