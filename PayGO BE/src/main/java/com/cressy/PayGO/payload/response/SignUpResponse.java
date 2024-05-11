package com.cressy.PayGO.payload.response;

import com.cressy.PayGO.entities.enums.Gender;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignUpResponse {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private Gender gender;
}
