package com.cressy.PayGO.entities;

import com.cressy.PayGO.entities.enums.Roles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserEntity extends BaseEntity{

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    @Transient
    private String password;

    private String confirmPassword;

    private String phoneNumber;

    private String profilePicture;

    @Enumerated(EnumType.STRING)
    private Roles role;

    private boolean isVerified = false;



}
