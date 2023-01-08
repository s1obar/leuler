package com.example.helper;

import org.springframework.stereotype.Component;

@Component
public class Helper {
    public String getMethodName(Class<?> clazz, int methodIndex){
        return clazz.getMethods()[methodIndex].getName();
    }
}
