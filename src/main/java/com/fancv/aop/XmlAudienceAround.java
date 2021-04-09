package com.fancv.aop;

import com.fancv.DTO.Computer;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author hamish-wu
 */
public class XmlAudienceAround {
    public Object aroundPringLog(ProceedingJoinPoint pjp) {
        Object rtValue = null;
        try {
            Object[] args = pjp.getArgs();//得到方法执行所需的参数

            if (args != null) {
                for (Object o : args) {
                    if (o instanceof String) {
                        System.out.println("String: "+o.toString());
                    }
                    if (o instanceof Computer) {
                        System.out.println("age: " + ((Computer) o).getAge());
                    }

                }
            }

            System.out.println("Logger类中的aroundPringLog方法开始记录日志了。。。前置");

            rtValue = pjp.proceed(args);//明确调用业务层方法（切入点方法）

            System.out.println("Logger类中的aroundPringLog方法开始记录日志了。。。后置");

            return rtValue;
        } catch (Throwable t) {
            System.out.println("Logger类中的aroundPringLog方法开始记录日志了。。。异常");
            throw new RuntimeException(t);
        } finally {
            System.out.println("Logger类中的aroundPringLog方法开始记录日志了。。。最终");
        }
    }

}
