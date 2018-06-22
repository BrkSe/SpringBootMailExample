package com.burakkutbay.mailexample;

import com.burakkutbay.mailexample.controller.MailController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailexampleApplication implements CommandLineRunner {

    @Autowired
    private MailController mailController;

    public static void main(String[] args) {
        SpringApplication.run(MailexampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        mailController.sendMail();
    }
}
