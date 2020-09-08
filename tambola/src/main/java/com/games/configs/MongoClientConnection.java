package com.games.configs;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MongoClientConnection{

    MongoClient mongoClient;

    public MongoClientConnection(MongoConfigs configs) {
        this.mongoClient = new MongoClient(configs.getConnectionString(), getOptionBuilder(configs));
    }

    private MongoClientOptions getOptionBuilder(MongoConfigs configs) {
        MongoClientOptions.Builder optionBuilder = new MongoClientOptions.Builder();
        optionBuilder.maxWaitTime(configs.getMaxWaitTimeInMilliSeconds());
        optionBuilder.connectTimeout(configs.getConnectTimeoutInMilliSeconds());
        optionBuilder.socketTimeout(configs.getSocketTimeoutInMilliSeconds());
        optionBuilder.connectionsPerHost(configs.getMaxConnectionsPerHost());
        return optionBuilder.build();
    }
}
