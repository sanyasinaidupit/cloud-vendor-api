package com.example.restdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;
    public String sendEmail(String toEmail,
                          String subject,
                          String body){
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom("komalilaveti.erpi@iipe.ac.in");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);
        mailSender.send(message);
        return "Mail sent successfully";
    }
}
