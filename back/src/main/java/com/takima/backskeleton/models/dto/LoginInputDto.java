package com.takima.backskeleton.models.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginInputDto {
    private String email;
    private String mdp;
}
