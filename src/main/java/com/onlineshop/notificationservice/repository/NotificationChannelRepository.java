package com.onlineshop.notificationservice.repository;

import com.onlineshop.notificationservice.model.Notification;
import com.onlineshop.notificationservice.model.NotificationChannel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationChannelRepository extends MongoRepository<NotificationChannel, String> {
}
