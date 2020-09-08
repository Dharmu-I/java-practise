package com.games.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseEntity {

    String identifier;

    Long createdAt;

    Long updatedAt;
}
