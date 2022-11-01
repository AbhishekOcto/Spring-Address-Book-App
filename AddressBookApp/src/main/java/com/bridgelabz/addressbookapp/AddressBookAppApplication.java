package com.bridgelabz.addressbookapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
//@EnableSwagger2
@SpringBootApplication
public class AddressBookAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AddressBookAppApplication.class, args);
        log.info("Employee payroll App Started in {} Environment", context.getEnvironment().getProperty("environment"));
    }

}
