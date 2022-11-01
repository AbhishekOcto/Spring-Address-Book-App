package com.bridgelabz.addressbookapp;

import com.bridgelabz.addressbookapp.service.EmailSenderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
//@EnableSwagger2
@SpringBootApplication
public class AddressBookAppApplication {
    @Autowired
    private EmailSenderService senderService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AddressBookAppApplication.class, args);
        log.info("Employee payroll App Started in {} Environment", context.getEnvironment().getProperty("environment"));
    }
    @EventListener(ApplicationReadyEvent.class)
    public void sendMail(){
        senderService.sendEmail("abhishek.mce13@gmail.com",
                "This is subject",
                "This is body of the mail");
    }

}
