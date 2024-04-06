package com.onlineshop.notificationservice.dto.dtoMapper;

import com.onlineshop.notificationservice.dto.request.NotificationDtoRequest;
import com.onlineshop.notificationservice.dto.response.NotificationDtoResponse;
import com.onlineshop.notificationservice.model.Notification;

public class NotificationDtoMapper {
    public static Notification toModel(NotificationDtoRequest notificationRequest){
        Notification notification = new Notification();
        notification.setTitle(notification.getTitle());
        notification.setMessage(notificationRequest.getMessage());
        notification.setUserId(notificationRequest.getUserId());

        return notification;
    }

    public static NotificationDtoResponse toResponse(Notification notification){
        NotificationDtoResponse response = new NotificationDtoResponse();
        response.setId(notification.getId());
        response.setTitle(notification.getTitle());
        response.setMessage(notification.getMessage());
        response.setUserId(notification.getUserId());
        response.setSentAt(notification.getSentAt());
        response.setIsRead(notification.getIsRead());

        return response;
    }
}
