package com.example.first100;

import com.example.helper.Helper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
    Find the sum of all the primes below two million.
**/
@Slf4j
@RequiredArgsConstructor
@Component
public class E_10 {

    private final Helper helper;

    public String solution1(){
        long sum = sumOfAllPrimesLessThen(2000000);

        log.info("SUm of all primes below 2000000 is: {}", sum);

        return  getMethodName();
    }

    private long sumOfAllPrimesLessThen(long number) {
        long num = 1;
        long sum = 0;

        while (num < number) {
            num++;
            if (helper.isPrime(num)) {
                sum += num;
            }
        }
        return sum;
    }


    private String getMethodName(){
        return helper.getMethodName(E_10.class,0);
    }
}
