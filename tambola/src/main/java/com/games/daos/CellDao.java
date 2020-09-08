package com.games.daos;

import com.games.entities.Cell;
import com.games.exceptions.DataAccessException;

public interface CellDao {

    void create(Cell cell) throws DataAccessException;
}
