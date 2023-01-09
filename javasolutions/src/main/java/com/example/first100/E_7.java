package com.example.first100;

import com.example.helper.Helper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    What is the 10 001st prime number?
**/
@Slf4j
@RequiredArgsConstructor
@Component
public class E_7 {

    private final Helper helper;
    public String solution1(){

        int finalPrime = 0;
        int index = 0;
        while(index < 10001){
            finalPrime++;
            for(int i = 2; true; i++){
                if(finalPrime % i == 0 && finalPrime != i){
                    break;
                }else if(finalPrime == i){
                    index++;
                    break;
                }
            }
        }

        log.info("10001. prime is: {}", finalPrime);

        return  getMethodName();
    }

    public String solution2(){
        long finalPrime = nthPrime(10001);

        log.info("10001. prime number is: {}", finalPrime);

        return  getMethodName();
    }

    private long nthPrime(long nthPrime) {
        int numberOfPrimes = 0;
        long num = 1;

        while (numberOfPrimes < nthPrime) {
            num++;
            if (isPrime(num)) {
                numberOfPrimes++;
            }
        }
        return num;
    }

    private boolean isPrime(long n) {
        if (n < 2){
            return false;
        } else if (n == 2) {
            return true;
        }
//TODO: figure out why Math.sqrt() is used
        for (int i = 2; i < Math.sqrt(n) + 1; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }


    private String getMethodName(){
        return helper.getMethodName(E_7.class,0);
    }
}
