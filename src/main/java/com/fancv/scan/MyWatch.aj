package com.fancv.scan;


public aspect MyWatch {

    void around():call(void com.fancv.scan.Person.sayHello()){
        System.out.println("开始事务 ...");
        proceed();
        System.out.println("事务结束 ...");
    }


}
