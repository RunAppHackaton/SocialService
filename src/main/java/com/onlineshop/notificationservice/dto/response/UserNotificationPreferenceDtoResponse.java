package com.onlineshop.notificationservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserNotificationPreferenceDtoResponse {
    @Id
    @Field(name = "preference_id")
    private String id;

    @Field(name = "user_id")
    private String userId;

    @Field(name = "is_enabled")
    private String isEnabled;

    @Field(name = "channel_id")
    private String channelId;
}
