package com.games.impls;

import com.games.constants.TambolaConstant;
import com.games.daos.UserDao;
import com.games.entities.User;
import com.games.exceptions.DataAccessException;
import com.games.exceptions.UserNotFoundException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.bson.conversions.Bson;

import javax.inject.Inject;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Inject))
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserDaoImpl implements UserDao {

    MongoCollection<Document> collection;

    public void create(User user) throws DataAccessException {
        Document document = TambolaConstant.OBJECT_MAPPER.convertValue(user, Document.class);
        collection.insertOne(document);
    }

    public User get(String id) throws UserNotFoundException, DataAccessException {
        Bson query = Filters.eq("id", id);
        Optional<Document> document = Optional.ofNullable(collection.find().filter(query).first());
        if (document.isPresent()){
            return TambolaConstant.OBJECT_MAPPER.convertValue(document.get(), User.class);
        }
        log.error("User id not exist : {} ", id);
        throw new UserNotFoundException("User not exist");
    }
}
