package com.codingshuttle.Module1Introduction.impl;

import com.codingshuttle.Module1Introduction.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Notification.type",havingValue="sms")
public class SmsNotification implements NotificationService {
    @Override
    public void sendMessage(String msg) {
        System.out.println("Sms ...."+msg);
    }
}
