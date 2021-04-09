package com.fancv.DTO;

/**
 * @author hamish-wu
 */
public class Computer {

    private String name;

    private Integer age;

    private Boolean tag;

    public Computer(String name, Integer age, Boolean tag) {
        this.name = name;
        this.age = age;
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getTag() {
        return tag;
    }

    public void setTag(Boolean tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tag=" + tag +
                '}';
    }
}
