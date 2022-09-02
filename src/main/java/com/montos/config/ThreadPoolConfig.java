package com.montos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author : MentosL
 * @date : 2022/9/2 15:46
 */
@Configuration
public class ThreadPoolConfig {


    @Bean(name = "defaultThreadPoolExecutor")
    public ThreadPoolExecutor getThreadPoolExecutor() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10, 10, TimeUnit.MINUTES, new LinkedBlockingDeque<>(100));
        return threadPoolExecutor;
    }
}
