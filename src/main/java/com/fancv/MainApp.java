package com.fancv;

import com.fancv.DTO.Computer;
import com.fancv.aop.Chinese;
import com.fancv.aop.UserValidator;
import com.fancv.scan.Car;
import com.fancv.scan.MyCar;
import com.fancv.scan.MyPerson;
import com.fancv.scan.Person;
import com.fancv.spring.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) throws Exception {
        /**
         * ClassPathXmlApplicationContext  不能代码修改environment
         */
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringBeans.xml");

        Environment environment = context.getEnvironment();
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        Chinese lilei = (Chinese)context.getBean("lilei");
        lilei.Say();



        MyPerson person = (MyPerson) context.getBean("person");
        person.st();
        Computer c = new Computer("level", 12, true);
        UserValidator u=(UserValidator)context.getBean("lilei");
        u.validate(c);
       /* person.watch("testAGe", c);*/
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