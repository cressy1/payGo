package com.cressy.PayGO.payload.response.authResponse;

import com.cressy.PayGO.entities.enums.Roles;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtAuthResponse {
    Long id;
    String firstName;
    String lastName;
    String profilePicture;
    String email;
    String phoneNumber;
    String subscription;
    Roles role;
    String accessToken;
    String refreshToken;
    String tokenType = "Bearer";
}
