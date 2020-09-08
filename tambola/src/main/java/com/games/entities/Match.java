package com.games.entities;

import com.games.enums.MatchStatus;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Match extends BaseEntity {

    String boardId;

    List<String> users;

    MatchStatus status;

}
