package com.games.daos;

import com.games.entities.Match;
import com.games.exceptions.DataAccessException;

public interface MatchDao {

    void create(Match match) throws DataAccessException;
}
