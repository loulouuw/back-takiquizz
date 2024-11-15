package com.takima.backskeleton.models.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDto {
    private String message;
    private int playerId;

    public LoginResponseDto(String message, int playerId) {
        this.message = message;
        this.playerId = playerId;
    }

}
