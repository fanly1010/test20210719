package com.fly.www.test;


import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AdminApplication {
    static Logger logger= LoggerFactory.getLogger(AdminApplication.class);

    public static void main(String[] args){

        SpringApplication.run(AdminApplication.class);
    }

}