package com.codingshuttle.Module1Introduction.impl;

import com.codingshuttle.Module1Introduction.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@ConditionalOnProperty(name = "Notification.type",havingValue="Email")
public class EmailNotification implements NotificationService {
    @Override
    public void sendMessage(String msg) {
        System.out.println("Email ...."+msg);
    }
}
