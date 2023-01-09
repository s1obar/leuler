package com.example.first100;

import com.example.helper.Helper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
    The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143?
**/
@Slf4j
@RequiredArgsConstructor
@Component
public class E_3{

    private final Helper helper;
    private static final long numToTest = 600851475143L;
    public String solution1(){
        long currentPrimeNumber = 3;
        long maxPrimeNumber = 0;
        long result = numToTest;

        while(result > 1){
            if(result % currentPrimeNumber != 0){
                currentPrimeNumber++;
            }else{
                result = result / currentPrimeNumber;

                if(maxPrimeNumber < currentPrimeNumber){
                    maxPrimeNumber = currentPrimeNumber;
                }
            }
        }

        log.info("Biggest prime number of {} is {}", numToTest, maxPrimeNumber);

        return getMethodName();
    }

    private String getMethodName(){
        return helper.getMethodName(E_3.class,0);
    }
}
