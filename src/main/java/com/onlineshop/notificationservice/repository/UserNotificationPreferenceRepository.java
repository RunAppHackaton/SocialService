package com.onlineshop.notificationservice.repository;

import com.onlineshop.notificationservice.model.UserNotificationPreference;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserNotificationPreferenceRepository extends MongoRepository<UserNotificationPreference, String> {
}
