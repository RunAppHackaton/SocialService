package com.onlineshop.notificationservice.service.impl;

import com.onlineshop.notificationservice.exception.MongoNotFoundException;
import com.onlineshop.notificationservice.model.Notification;
import com.onlineshop.notificationservice.repository.NotificationRepository;
import com.onlineshop.notificationservice.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class NotificationServiceImpl implements NotificationService {

    private NotificationRepository notificationRepository;

    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public Notification create(Notification notification) {
        log.info("Notification create: {}", notification);
        notification.setIsRead("N");
        notification.setSentAt(LocalDateTime.now());
        return notificationRepository.save(notification);
    }

    @Override
    public Notification update(String id, Notification notification) {
        log.info("Notification update: {}", notification);
        Notification updatedNotification = getByID(id);
        updatedNotification.setTitle(notification.getTitle());
        updatedNotification.setMessage(notification.getMessage());
        updatedNotification.setUserId(notification.getUserId());
        return updatedNotification;
    }

    @Override
    public Notification getByID(String id) {
        log.info("Notification get by id: {}", id);
        return notificationRepository.findById(id).orElseThrow(()-> new MongoNotFoundException("Notification with id: "+id+"is not found"));
    }

    @Override
    public Boolean delete(String id) {
        log.info("Notification delete by id: {}", id);
        notificationRepository.deleteById(id);
        return true;
    }
}
