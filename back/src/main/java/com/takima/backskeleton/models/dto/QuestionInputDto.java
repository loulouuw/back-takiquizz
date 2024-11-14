package com.takima.backskeleton.models.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionInputDto {

    private String statement;
    private String correctAnswer;
    private String questionType;
    private String image;
    private int timeLimit;
    private String incorrectAnswers;
    private int quizzId;
}
