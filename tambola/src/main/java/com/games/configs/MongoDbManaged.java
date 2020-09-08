package com.games.configs;

import com.games.constants.TambolaConstant;
import com.games.impls.*;
import com.mongodb.MongoClient;
import io.dropwizard.lifecycle.Managed;

public class MongoDbManaged implements Managed {

    MongoClient mongoClient;

    MongoConfigs mongoConfigs;

    public MongoDbManaged(MongoClient mongoClient, MongoConfigs mongoConfigs) {
        this.mongoClient = mongoClient;
        this.mongoConfigs = mongoConfigs;
    }

    public void start() throws Exception {
        new BoardDaoImpl(mongoClient.getDatabase(mongoConfigs.getDatabase())
                .getCollection(TambolaConstant.CollectionConstants.BOARD_COLLECTION));
        new CardDaoImpl(mongoClient.getDatabase(mongoConfigs.getDatabase())
                .getCollection(TambolaConstant.CollectionConstants.CARD_COLLECTION));
        new CellDaoImpl(mongoClient.getDatabase(mongoConfigs.getDatabase())
                .getCollection(TambolaConstant.CollectionConstants.CELLS_COLLECTION));
        new MatchDaoImpl(mongoClient.getDatabase(mongoConfigs.getDatabase())
                .getCollection(TambolaConstant.CollectionConstants.MATCHES_COLLECTION));
        new UserDaoImpl(mongoClient.getDatabase(mongoConfigs.getDatabase())
                .getCollection(TambolaConstant.CollectionConstants.USER_COLLECTION));
    }

    public void stop() throws Exception {

    }
}
