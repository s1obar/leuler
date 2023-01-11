package com.example.first100;

import com.example.helper.Helper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
        a² + b² = c²
    For example, 3² + 4² = 9 + 16 = 25 = 5².

    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.
**/
@Slf4j
@RequiredArgsConstructor
@Component
public class E_9 {

    private final Helper helper;


    public String solution1(){
       double product = 0;

       for(int a = 3; a <= 1000; a++){
           for(int b = a + 1; b < 1000; b++){
               double cSquared = Math.pow(a, 2) + Math.pow(b, 2);
               double c = Math.sqrt(cSquared);

               if(a + b + c == 1000){
                   log.info("a + b + c = 1000");
                   product = a * b * c;
                   break;
               }
           }
       }

       log.info("Product abc is {}", product);

        return  getMethodName();
    }


    private String getMethodName(){
        return helper.getMethodName(E_9.class,0);
    }
}
