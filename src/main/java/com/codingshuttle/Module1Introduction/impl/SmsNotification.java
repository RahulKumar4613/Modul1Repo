package com.codingshuttle.Module1Introduction.impl;

import com.codingshuttle.Module1Introduction.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class SmsNotification implements NotificationService {
    @Override
    public void sendMessage(String msg) {
        System.out.println("Sms ...."+msg);
    }
}
