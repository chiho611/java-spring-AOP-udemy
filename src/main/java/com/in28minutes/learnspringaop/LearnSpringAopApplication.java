package com.in28minutes.learnspringaop;

import com.in28minutes.learnspringaop.business.BusinessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LearnSpringAopApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private BusinessService businessService;

    public  LearnSpringAopApplication(BusinessService businessService) {
        this.businessService = businessService;
    }

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringAopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Max Value return is {}", businessService.findMax());
    }
}
