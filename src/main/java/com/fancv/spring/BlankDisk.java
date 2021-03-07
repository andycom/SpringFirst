package com.fancv.spring;

import java.util.List;

public class BlankDisk {

    private String name;
    private String age;

    private List<String> diskList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<String> getDiskList() {
        return diskList;
    }

    public void setDiskList(List<String> diskList) {
        this.diskList = diskList;
    }

    public void play() {
        System.out.println("Playing" + name + "age : " + age);
    }
}
