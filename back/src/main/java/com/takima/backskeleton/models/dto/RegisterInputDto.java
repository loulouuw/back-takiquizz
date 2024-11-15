package com.takima.backskeleton.models.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterInputDto {
    private String username;
    private String email;
    private String mdp;
}
