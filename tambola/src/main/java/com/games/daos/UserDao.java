package com.games.daos;

import com.games.entities.User;
import com.games.exceptions.DataAccessException;
import com.games.exceptions.UserNotFoundException;

public interface UserDao {

    void create(User user) throws DataAccessException;

    User get(String id) throws UserNotFoundException, DataAccessException;
}
