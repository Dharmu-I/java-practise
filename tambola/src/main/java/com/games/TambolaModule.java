package com.games;

import com.games.configs.MongoConfigs;
import com.games.configs.TambolaConfiguration;
import com.games.daos.*;
import com.games.impls.*;
import com.google.inject.AbstractModule;

public class TambolaModule extends AbstractModule {

    TambolaConfiguration configuration;

    public TambolaModule(TambolaConfiguration configuration) {
        this.configuration = configuration;
    }

    protected void configure() {
        bind(MongoConfigs.class).toInstance(configuration.getMongoConfigs());
        bind(BoardDao.class).to(BoardDaoImpl.class);
        bind(CardDao.class).to(CardDaoImpl.class);
        bind(CellDao.class).to(CellDaoImpl.class);
        bind(MatchDao.class).to(MatchDaoImpl.class);
        bind(UserDao.class).to(UserDaoImpl.class);
    }
}
