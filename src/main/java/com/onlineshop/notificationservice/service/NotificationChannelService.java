package com.onlineshop.notificationservice.service;

import com.onlineshop.notificationservice.model.Notification;
import com.onlineshop.notificationservice.model.NotificationChannel;

public interface NotificationChannelService {
    public NotificationChannel create(NotificationChannel notificationChannel);
    public NotificationChannel update(String id, NotificationChannel notificationChannel);
    public NotificationChannel getByID(String id);
    public Boolean delete(String id);
}
