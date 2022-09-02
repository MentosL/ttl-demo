package com.montos;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author : MentosL
 * @date : 2022/8/31 23:02
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TTlDemoApplication {

    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(TTlDemoApplication.class);
        sa.run(args);
    }
}
