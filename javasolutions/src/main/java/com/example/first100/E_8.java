package com.example.first100;

import com.example.helper.Helper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**

**/
@Slf4j
@RequiredArgsConstructor
@Component
public class E_8 {

    private final Helper helper;
    public String solution1(){

        return  getMethodName();
    }


    private String getMethodName(){
        return helper.getMethodName(E_8.class,0);
    }
}
