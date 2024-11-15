package com.takima.backskeleton.models.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuizzResponseDto {
    private int quizId;

    public QuizzResponseDto(int quizId) {
        this.quizId = quizId;
    }
}
