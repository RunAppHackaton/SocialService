package com.onlineshop.notificationservice.service.impl;

import com.onlineshop.notificationservice.exception.MongoNotFoundException;
import com.onlineshop.notificationservice.model.NotificationChannel;
import com.onlineshop.notificationservice.repository.NotificationChannelRepository;
import com.onlineshop.notificationservice.service.NotificationChannelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationChannelServiceImpl implements NotificationChannelService {

    private final NotificationChannelRepository notificationChannelRepository;

    public NotificationChannelServiceImpl(NotificationChannelRepository notificationChannelRepository) {
        this.notificationChannelRepository = notificationChannelRepository;
    }

    @Override
    public NotificationChannel create(NotificationChannel notificationChannel) {
        log.info("NotificationChannel create: {}", notificationChannel);
        return notificationChannelRepository.save(notificationChannel);
    }

    @Override
    public NotificationChannel update(String id, NotificationChannel notificationChannel) {
        getByID(id);
        notificationChannel.setId(id);
        log.info("NotificationChannel update by id: {}, NotificationChannel: {}", id, notificationChannel);
        return notificationChannelRepository.save(notificationChannel);
    }

    @Override
    public NotificationChannel getByID(String id) {
        log.info("NotificationChannel get by id: {}", id);
        return notificationChannelRepository.findById(id).orElseThrow(()->new MongoNotFoundException("NotificationChannel with id: "+ id+ " is not found"));
    }


    @Override
    public Boolean delete(String id) {
        log.info("NotificationChannel get by id: {}", id);
        notificationChannelRepository.deleteById(id);
        return true;
    }
}
