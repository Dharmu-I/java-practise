package com.games.configs;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MongoConfigs {

    String connectionString;

    String database;

    Integer maxWaitTimeInMilliSeconds;

    Integer connectTimeoutInMilliSeconds;

    Integer socketTimeoutInMilliSeconds;

    Integer maxConnectionsPerHost;
}
