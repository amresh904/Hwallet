package com.hcomany.hwallet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.hcomany.controller.UserController;


@SpringBootApplication(scanBasePackages = {"com.hcomany"})
public class HwalletApplication {

    public static final Logger logger = LoggerFactory.getLogger(HwalletApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HwalletApplication.class, args);
    }

}
