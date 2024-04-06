package com.onlineshop.notificationservice.dto.dtoMapper;

import com.onlineshop.notificationservice.dto.request.UserNotificationPreferenceDtoRequest;
import com.onlineshop.notificationservice.dto.response.UserNotificationPreferenceDtoResponse;
import com.onlineshop.notificationservice.model.UserNotificationPreference;

public class UserNotificationPreferenceDtoMapper {
    public static UserNotificationPreference toModel(UserNotificationPreferenceDtoRequest request){
        UserNotificationPreference userNotificationPreference = new UserNotificationPreference();
        userNotificationPreference.setUserId(request.getUserId());
        userNotificationPreference.setChannelId(request.getChannelId());
        userNotificationPreference.setIsEnabled(request.getIsEnabled());

        return userNotificationPreference;
    }

    public static UserNotificationPreferenceDtoResponse toResponse(UserNotificationPreference userNotificationPreference){
        UserNotificationPreferenceDtoResponse response = new UserNotificationPreferenceDtoResponse();
        response.setId(userNotificationPreference.getId());
        response.setUserId(userNotificationPreference.getUserId());
        response.setChannelId(userNotificationPreference.getChannelId());
        response.setIsEnabled(userNotificationPreference.getIsEnabled());

        return response;
    }
}
