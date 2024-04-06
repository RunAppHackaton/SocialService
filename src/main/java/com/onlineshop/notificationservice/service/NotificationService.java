package com.onlineshop.notificationservice.service;

import com.onlineshop.notificationservice.model.Notification;
import com.onlineshop.notificationservice.model.NotificationChannel;

public interface NotificationService {
    public Notification create(Notification notification);
    public Notification update(String id, Notification notification);
    public Notification getByID(String id);
    public Boolean delete(String id);
}
