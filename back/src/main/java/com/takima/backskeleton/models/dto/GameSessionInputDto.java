package com.takima.backskeleton.models.dto;
import com.takima.backskeleton.models.Player;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
public class GameSessionInputDto {

    private Instant startTime;
    private Instant endTime;
    private int score1;
    private int score2;
    private long quizzId;
    private long playerId1;
    private long playerId2;



}
