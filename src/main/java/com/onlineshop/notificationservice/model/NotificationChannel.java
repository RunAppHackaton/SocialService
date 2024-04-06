package com.onlineshop.notificationservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document
public class NotificationChannel {
    @Id
    @Field(name = "channel_id")
    private String id;

    @Field(name = "name")
    private String name;

    @Field(name = "description")
    private String description;
}
