package com.games.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cell extends BaseEntity {

    Integer value;

    boolean picked;

    Integer row;
}
