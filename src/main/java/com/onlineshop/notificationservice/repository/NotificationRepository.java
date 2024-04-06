package com.onlineshop.notificationservice.repository;

import com.onlineshop.notificationservice.model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {
}
