package com.games.configs;

import io.dropwizard.Configuration;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TambolaConfiguration extends Configuration {

    MongoConfigs mongoConfigs;
}
