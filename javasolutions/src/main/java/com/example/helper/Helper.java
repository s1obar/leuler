package com.example.helper;

import org.springframework.stereotype.Component;

@Component
public class Helper {
    public String getMethodName(Class<?> clazz, int methodIndex){
        return clazz.getMethods()[methodIndex].getName();
    }

    public boolean isPrime(long n) {
        if (n < 2){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
