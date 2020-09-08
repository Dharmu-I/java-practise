package com.games.impls;

import com.games.constants.TambolaConstant;
import com.games.daos.BoardDao;
import com.games.entities.Board;
import com.games.exceptions.DataAccessException;
import com.mongodb.client.MongoCollection;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.bson.Document;

import javax.inject.Inject;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BoardDaoImpl implements BoardDao {

    MongoCollection<Document> collection;

    public void create(Board board) throws DataAccessException {
        Document document = TambolaConstant.OBJECT_MAPPER.convertValue(board, Document.class);
        collection.insertOne(document);
    }
}
