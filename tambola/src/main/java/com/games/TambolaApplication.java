package com.games;


import com.games.configs.*;
import com.google.inject.Guice;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class TambolaApplication extends Application<TambolaConfiguration> {

    public void run(TambolaConfiguration configuration, Environment environment) {
        Guice.createInjector(new TambolaModule(configuration));
        MongoDbManaged mongoDbManaged = new MongoDbManaged(new MongoClientConnection(configuration.getMongoConfigs())
                .getMongoClient(), configuration.getMongoConfigs());
        environment.lifecycle().manage(mongoDbManaged);
    }
}
