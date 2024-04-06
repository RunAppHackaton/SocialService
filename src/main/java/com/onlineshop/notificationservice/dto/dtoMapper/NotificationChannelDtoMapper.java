package com.onlineshop.notificationservice.dto.dtoMapper;

import com.onlineshop.notificationservice.dto.request.NotificationChannelDtoRequest;
import com.onlineshop.notificationservice.dto.response.NotificationChannelDtoResponse;
import com.onlineshop.notificationservice.model.NotificationChannel;

public class NotificationChannelDtoMapper {
    public static NotificationChannel toModel(NotificationChannelDtoRequest request){
        NotificationChannel notificationChannel = new NotificationChannel();
        notificationChannel.setName(request.getName());
        notificationChannel.setName(request.getDescription());

        return notificationChannel;
    }

    public static NotificationChannelDtoResponse toModel(NotificationChannel notificationChannel){
        NotificationChannelDtoResponse response = new NotificationChannelDtoResponse();
        notificationChannel.setId(notificationChannel.getId());
        notificationChannel.setName(notificationChannel.getName());
        notificationChannel.setName(notificationChannel.getDescription());

        return response;
    }
}
