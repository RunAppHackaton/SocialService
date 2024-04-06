package com.onlineshop.notificationservice.service.impl;

import com.onlineshop.notificationservice.exception.MongoNotFoundException;
import com.onlineshop.notificationservice.model.UserNotificationPreference;
import com.onlineshop.notificationservice.repository.UserNotificationPreferenceRepository;
import com.onlineshop.notificationservice.service.NotificationChannelService;
import com.onlineshop.notificationservice.service.UserNotificationPreferenceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserNotificationPreferenceServiceImpl implements UserNotificationPreferenceService {

    private final UserNotificationPreferenceRepository userNotificationPreferenceRepository;
    private final NotificationChannelService notificationChannelService;

    public UserNotificationPreferenceServiceImpl(UserNotificationPreferenceRepository userNotificationPreferenceRepository, NotificationChannelService notificationChannelService) {
        this.userNotificationPreferenceRepository = userNotificationPreferenceRepository;
        this.notificationChannelService = notificationChannelService;
    }

    @Override
    public UserNotificationPreference create(UserNotificationPreference userNotificationPreference) {
        log.info("UserNotificationPreference create: {}", userNotificationPreference);
        //check if channel exists
        notificationChannelService.getByID(userNotificationPreference.getChannelId());

        return userNotificationPreferenceRepository.save(userNotificationPreference);
    }

    @Override
    public UserNotificationPreference update(String id, UserNotificationPreference userNotificationPreference) {
        UserNotificationPreference updatedUserNotificationPreference = getByID(id);
        updatedUserNotificationPreference.setUserId(userNotificationPreference.getUserId());
        //check if channel exists
        notificationChannelService.getByID(userNotificationPreference.getChannelId());

        updatedUserNotificationPreference.setChannelId(userNotificationPreference.getChannelId());
        updatedUserNotificationPreference.setUserId(userNotificationPreference.getUserId());
        log.info("UserNotificationPreference update by id: {}, UserNotificationPreference: {}", id, updatedUserNotificationPreference);
        return userNotificationPreferenceRepository.save(updatedUserNotificationPreference);
    }

    @Override
    public UserNotificationPreference getByID(String id) {
        log.info("UserNotificationPreference get by id: {}", id);
        return userNotificationPreferenceRepository.findById(id).orElseThrow(()->new MongoNotFoundException("UserNotificationPreference with id: "+id+" is not found"));
    }

    @Override
    public Boolean delete(String id) {
        log.info("UserNotificationPreference delete by id: {}", id);
        return true;
    }
}
