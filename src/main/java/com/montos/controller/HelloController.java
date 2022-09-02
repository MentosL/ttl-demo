package com.montos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author : MentosL
 * @date : 2022/9/2 15:41
 */
@RestController
@RequestMapping("hello/")
public class HelloController {

    private ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,1,10, TimeUnit.MINUTES,new LinkedBlockingDeque<>());
    private ThreadLocal<String> stringThreadLocal = new ThreadLocal<>();

    private ThreadLocal<Integer> integerThreadLocal = new ThreadLocal<>();


    @RequestMapping("sayHello/string")
    public void sayHelloString(){
        stringThreadLocal.set("1");
        threadPoolExecutor.execute(() -> {
            System.out.println("hello world! - string");
            System.out.println("stringThreadLocal value is :" + stringThreadLocal.get());
        });
    }




    @RequestMapping("sayHello/integer")
    public void sayHelloInteger(){
        integerThreadLocal.set(1);
        threadPoolExecutor.execute(() -> {
            System.out.println("hello world! - integer");
            System.out.println("stringThreadLocal value is :" + integerThreadLocal.get());
        });
    }

}
