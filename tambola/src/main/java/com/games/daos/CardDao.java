package com.games.daos;

import com.games.entities.Card;
import com.games.exceptions.DataAccessException;

public interface CardDao {

    void create(Card card) throws DataAccessException;
}
