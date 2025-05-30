package com.example.apigatewayservice.presentationlayer.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestModel {
    private String username;
    private String email;
    private String password;
    private double balance;
}
