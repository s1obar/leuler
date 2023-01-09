package com.example.first100;

import com.example.helper.Helper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 The sum of the squares of the first ten natural numbers is,
    1² + 2² +...+ 10² = 385
 The square of the sum of the first ten natural numbers is,
    (1+2+3+...+10)² = 55² = 3025
 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
**/
@Slf4j
@RequiredArgsConstructor
@Component
public class E_6 {

    private final Helper helper;
    public String solution1(){
        int sumOfSquares = 0;
        int sumOfNumbers = 0;
        int sumSquared = 0;
        for(int i = 1; i <= 100; i++){
            int square = i * i;
            sumOfSquares += square;
            sumOfNumbers += i;

            if(i == 100){
                sumSquared = sumOfNumbers * sumOfNumbers;
            }
        }

        log.info("Difference is: {}", sumSquared - sumOfSquares);

        return  getMethodName();
    }


    private String getMethodName(){
        return helper.getMethodName(E_6.class,0);
    }
}
