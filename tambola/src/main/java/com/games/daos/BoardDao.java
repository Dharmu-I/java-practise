package com.games.daos;

import com.games.entities.Board;
import com.games.exceptions.DataAccessException;

public interface BoardDao {
    void create(Board board) throws DataAccessException;
}
