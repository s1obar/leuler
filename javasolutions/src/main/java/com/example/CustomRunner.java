package com.example;

import com.example.first100.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class CustomRunner implements ApplicationRunner {
    private final E_1 e1;
    private final E_2 e2;
    private final E_3 e3;
    private final E_4 e4;
    private final E_5 e5;
    private final E_6 e6;
    @Override
    public void run(ApplicationArguments args){

        long startTime = System.nanoTime();
        String methodName = e6.solution1();
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;

        log.info("Time elapsed for method {} is: {}", methodName, elapsedTime);

        System.exit(0);
    }
}
