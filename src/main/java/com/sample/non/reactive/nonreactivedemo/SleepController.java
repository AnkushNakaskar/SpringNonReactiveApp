package com.sample.non.reactive.nonreactivedemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ankushnakaskar
 */
@RestController
@RequestMapping("/sleep")
@Slf4j
public class SleepController {

    @GetMapping("{sleep}")
    public Boolean sleepForTime(@PathVariable Long sleep){
        try {
            log.info(Thread.currentThread()+"  Sleeping for : "+sleep);
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Boolean.TRUE;
    }
}
