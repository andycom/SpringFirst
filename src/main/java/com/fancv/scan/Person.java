package com.fancv.scan;


import com.fancv.DTO.Computer;
import org.springframework.stereotype.Component;

/**
 *
 */

@Component
public class Person implements MyPerson{


    private String name="123";

    private Integer age=14  ;



    public void print() throws Exception {

        System.out.println("这里调用person 打印数据");
        System.out.println(this.age);
        System.out.println(this.name);
       /* throw new Exception("测试错");*/
    }


    public Computer watch(String s , Computer computer){
        System.out.println("传入参数"+s);
        System.out.println(computer.getAge());
        return computer;
    }

    @Override
    public void st() {
        System.out.println("实现接口");
    }
}
