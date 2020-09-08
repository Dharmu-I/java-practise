package com.games;

import com.games.configs.MongoClientConnection;
import com.games.configs.MongoConfigs;
import com.games.constants.TambolaConstant;
import com.games.entities.Board;
import com.games.exceptions.DataAccessException;
import com.games.impls.BoardDaoImpl;
import com.mongodb.MongoClient;
import org.junit.Test;

public class MongoInsertionTest {

    @Test
    public void documentCreation() throws DataAccessException {
        MongoConfigs mongoConfigs = new MongoConfigs();
        mongoConfigs.setConnectionString("localhost:27017");
        mongoConfigs.setConnectTimeoutInMilliSeconds(1000);
        mongoConfigs.setDatabase("tambola");
        mongoConfigs.setMaxConnectionsPerHost(2);
        mongoConfigs.setMaxWaitTimeInMilliSeconds(1000);
        mongoConfigs.setSocketTimeoutInMilliSeconds(1000);
        MongoClient mongoClient = new MongoClientConnection(mongoConfigs).getMongoClient();
        BoardDaoImpl boardDao = new BoardDaoImpl(mongoClient.getDatabase(mongoConfigs.getDatabase())
                .getCollection(TambolaConstant.CollectionConstants.BOARD_COLLECTION));
        Board board = new Board();
        board.setCreatedAt(System.currentTimeMillis());
        board.setUpdatedAt(System.currentTimeMillis());
        board.setIdentifier("Dummy_Board_ID");
        boardDao.create(board);
    }
}
