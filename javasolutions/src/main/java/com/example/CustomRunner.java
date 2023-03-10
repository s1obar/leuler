package com.example;

import com.example.first100.E_11;
import com.example.first100.E_12;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class CustomRunner implements ApplicationRunner {
    private final E_12 e12;
    @Override
    public void run(ApplicationArguments args){

        long startTime = System.nanoTime();
        String methodName = e12.solution1();
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;

        log.info("Time elapsed for method {} is: {}", methodName, elapsedTime);

        System.exit(0);
    }
}
