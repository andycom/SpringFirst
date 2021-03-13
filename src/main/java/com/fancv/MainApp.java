package com.fancv;

import com.fancv.scan.Car;
import com.fancv.scan.MyCar;
import com.fancv.spring.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;

public class MainApp {
    public static void main(String[] args) {
        /**
         * ClassPathXmlApplicationContext  不能代码修改environment
         */
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringBeans.xml");
        /**
         * 可以修改 ConfigurableEnvironment
         */
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("dev");
        ctx.register(Car.class);
        ctx.refresh();

        System.out.println(context.getApplicationName());
        System.out.println(context.getDisplayName());
        System.out.println(context.getId());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(context.getStartupDate()));
        ApplicationContext context2 =
                new ClassPathXmlApplicationContext("SpringBeans.xml");
        HelloWorld obj2 = (HelloWorld) context2.getBean("helloWorld");
        obj2.getMessage();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(context.getStartupDate()));

        Car obj = (Car) context.getBean("minCar");
        obj.driver();

        MyCar obj3 = (MyCar) context.getBean("myCar");
        obj3.myDriver();
    }
}