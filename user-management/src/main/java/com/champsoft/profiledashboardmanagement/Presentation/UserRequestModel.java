package com.champsoft.profiledashboardmanagement.Presentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestModel {
    private String username;
    private String email;
    private String password;
    private double balance;
}
