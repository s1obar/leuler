package com.example.first100;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
    ASSIGNMENT: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
                The sum of these multiples is 23.
                Find the sum of all the multiples of 3 or 5 below 1000.
**/
@Slf4j
@Component
public class Euler1 {
    public void solution1(){
        int sum = 0;
        for(int i = 1; i < 1000; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }

        log.info("Sum is: {}", sum);
    }

    public void solution2(){
        int sum = 0;
        for(int i = 1; i < 1000; i++){
            if(i % 3 == 0){
                sum += i;
            }else if(i % 5 == 0){
                sum += i;
            }
        }

        log.info("Sum is: {}", sum);
    }


}
