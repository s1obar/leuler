package com.example;

import com.example.first100.E_8;
import com.example.first100.E_9;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class CustomRunner implements ApplicationRunner {
    private final E_9 e9;
    @Override
    public void run(ApplicationArguments args){

        long startTime = System.nanoTime();
        String methodName = e9.solution1();
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;

        log.info("Time elapsed for method {} is: {}", methodName, elapsedTime);

        System.exit(0);
    }
}
