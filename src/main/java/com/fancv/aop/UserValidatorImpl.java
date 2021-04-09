package com.fancv.aop;


import com.fancv.DTO.Computer;

public class UserValidatorImpl implements UserValidator {

    @Override
    public boolean validate(Computer user) {
        System.out.println("引入新的接口" + UserValidator.class.getSimpleName());
        return user != null;
    }

}

