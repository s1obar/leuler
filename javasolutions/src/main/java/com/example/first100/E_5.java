package com.example.first100;

import com.example.helper.Helper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
**/
@Slf4j
@RequiredArgsConstructor
@Component
public class E_5 {

    private final Helper helper;
    public String solution1(){

        int number = 0;

        boolean numberIsNotEvenlyDivisible = false;

        while(!numberIsNotEvenlyDivisible){
            number++;

            for(int i = 1; i <= 20; i++){
                if(number % i != 0){
                    break;
                }else {
                    if(i == 20) {
                        numberIsNotEvenlyDivisible = true;
                        log.info("Smallest positive number that is evenly divisible by all of the numbers from 1 to 20: {}.", number);
                        break;
                    }
                }
            }
        }


        return  getMethodName();
    }


    private String getMethodName(){
        return helper.getMethodName(E_5.class,0);
    }
}
