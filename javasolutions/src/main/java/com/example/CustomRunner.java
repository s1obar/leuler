package com.example;

import com.example.first100.Euler1;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class CustomRunner implements ApplicationRunner {
    private final Euler1 euler1;
    @Override
    public void run(ApplicationArguments args){

        long startTime1 = System.nanoTime();;
        euler1.solution1();
        long stopTime1 = System.nanoTime();;
        long elapsedTime1 = stopTime1 - startTime1;

        log.info("Time elapsed euler1.solution1() for is: {}", elapsedTime1);
        long startTime2 = System.nanoTime();;
        euler1.solution2();
        long stopTime2 = System.nanoTime();;
        long elapsedTime2 = stopTime2 - startTime2;

        log.info("Time elapsed euler1.solution2() for is: {}", elapsedTime2);
        System.exit(0);
    }
}
