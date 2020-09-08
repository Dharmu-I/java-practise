package com.games.impls;

import com.games.constants.TambolaConstant;
import com.games.daos.CardDao;
import com.games.entities.Card;
import com.games.exceptions.DataAccessException;
import com.mongodb.client.MongoCollection;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.bson.Document;

import javax.inject.Inject;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CardDaoImpl implements CardDao {

    MongoCollection<Document> collection;

    public void create(Card card) throws DataAccessException {
        Document document = TambolaConstant.OBJECT_MAPPER.convertValue(card, Document.class);
        collection.insertOne(document);
    }
}
