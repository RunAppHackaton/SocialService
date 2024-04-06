package com.onlineshop.notificationservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NotificationChannelDtoResponse {
    private String id;

    private String name;

    private String description;
}
