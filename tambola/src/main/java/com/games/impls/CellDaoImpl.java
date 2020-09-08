package com.games.impls;

import com.games.constants.TambolaConstant;
import com.games.daos.CellDao;
import com.games.entities.Cell;
import com.games.exceptions.DataAccessException;
import com.mongodb.client.MongoCollection;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.bson.Document;

import javax.inject.Inject;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CellDaoImpl implements CellDao {

    MongoCollection<Document> collection;

    public void create(Cell cell) throws DataAccessException {
        Document document = TambolaConstant.OBJECT_MAPPER.convertValue(cell, Document.class);
        collection.insertOne(document);
    }
}
