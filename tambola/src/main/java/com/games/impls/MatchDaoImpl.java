package com.games.impls;

import com.games.constants.TambolaConstant;
import com.games.daos.MatchDao;
import com.games.entities.Match;
import com.games.exceptions.DataAccessException;
import com.mongodb.client.MongoCollection;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.bson.Document;

import javax.inject.Inject;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MatchDaoImpl implements MatchDao {

    MongoCollection<Document> collection;

    public void create(Match match) throws DataAccessException {
        Document document = TambolaConstant.OBJECT_MAPPER.convertValue(match, Document.class);
        collection.insertOne(document);
    }
}
