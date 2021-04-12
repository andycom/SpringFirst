package com.fancv.aspectj;

public aspect TxAspect {
    void around():call(void HelloWorld.sayHello()){
        System.out.println("开始事务。。。");
        proceed();
        System.out.println("结束事务。。。");
    }
}
