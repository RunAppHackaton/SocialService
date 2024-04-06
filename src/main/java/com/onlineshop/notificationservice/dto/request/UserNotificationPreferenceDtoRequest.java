package com.onlineshop.notificationservice.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserNotificationPreferenceDtoRequest {
    @NotNull(message = "User Id cannot be null")
    @NotBlank(message = "User Id cannot be blank")
    private String userId;

    @NotNull(message = "IsEnabled cannot be null")
    @Pattern(regexp = "[NY]", message = "Is Enabled must be 'N' or 'Y'")
    private String isEnabled;

    @NotNull(message = "Channel Id cannot be null")
    @NotBlank(message = "Channel Id cannot be blank")
    private String channelId;
}
