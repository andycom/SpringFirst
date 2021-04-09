package com.fancv.aop;

import com.fancv.DTO.Computer;
import org.aopalliance.aop.Advice;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Monitor implements Advice {

    public void beforeStart() {
        System.out.println("1,before methord");
    }

    public void take() {
        System.out.println("take");

    }

    public void takeException() {
        System.out.println("发生了错误 怎么处理呢");

    }

    public void all() {
        System.out.println("3.all");
    }

    public void finish(JoinPoint joinPoint, Computer computer) {
        joinPoint.getArgs();
        System.out.println(computer.toString());
        System.out.println("4.finish");
    }
}
