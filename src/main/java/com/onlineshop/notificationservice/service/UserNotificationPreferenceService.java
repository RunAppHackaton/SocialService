package com.onlineshop.notificationservice.service;

import com.onlineshop.notificationservice.model.NotificationChannel;
import com.onlineshop.notificationservice.model.UserNotificationPreference;

public interface UserNotificationPreferenceService {
    public UserNotificationPreference create(UserNotificationPreference userNotificationPreference);
    public UserNotificationPreference update(String id, UserNotificationPreference userNotificationPreference);
    public UserNotificationPreference getByID(String id);
    public Boolean delete(String id);
}
