package com.hcomany.hwallet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;


@SpringBootApplication(scanBasePackages = {"com.hcomany"})
@EnableAutoConfiguration(exclude = { MongoAutoConfiguration.class })
public class HwalletApplication {

    public static final Logger logger = LoggerFactory.getLogger(HwalletApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HwalletApplication.class, args);
    }

}
