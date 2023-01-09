package com.example.first100;

import com.example.helper.Helper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
    A palindromic number reads the same both ways.
    The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    Find the largest palindrome made from the product of two 3-digit numbers.
**/
@Slf4j
@RequiredArgsConstructor
@Component
public class E_4 {

    private final Helper helper;
    public String solution1(){

        int maxPalindrome = 0;
        for(int j = 100; j <= 999; j++){
            for(int k = 999; k >= 100; k--){
                int result = j * k;
                String resultAsString = String.valueOf(j * k);
                if(checkIfItIsPalindrome(resultAsString)){
                    if(maxPalindrome < result){
                        maxPalindrome = result;
                    }
                }
            }
        }


        log.info("Max palindrome as a product of two 3 digit numbers is: {}", maxPalindrome);
        return  getMethodName();
    }

    private boolean checkIfItIsPalindrome(String result){
        for(int i = 0; i <= result.length() - 1; i++){
            if(result.charAt(i) != result.charAt(result.length() - i - 1)){
                return false;
            }else{
                if(i + 1 >= result.length()/2){
                    break;
                }
            }
        }

        return true;
    }

    private String getMethodName(){
        return helper.getMethodName(E_4.class,0);
    }
}
