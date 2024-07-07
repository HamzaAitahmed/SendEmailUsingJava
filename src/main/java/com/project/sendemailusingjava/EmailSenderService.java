package com.project.sendemailusingjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;
    public void sendEmail(String to) {
        System.out.println("Sending email...");
        SimpleMailMessage message = new SimpleMailMessage();

        System.out.println("1st Step ...");
//        message.setFrom("hamzaaitahmeddev@gmail.com"); // u have to config this email to get a password of 16 char go to app password and add project name as an app
//                                                       // Check src/main/resources/application.properties

//        System.out.println("2nd Step...");
        message.setTo(to); // dont forget to use your email

        System.out.println("3rd Step...");
        message.setSubject("Spring Boot Test Sending Email");

        System.out.println("4th Step...");
        message.setText("Spring Test Email Body ---> Hamza  Ait Ahmed");

        System.out.println("last Step...");
        mailSender.send(message);

        System.out.println("Email sent");

    }
}
