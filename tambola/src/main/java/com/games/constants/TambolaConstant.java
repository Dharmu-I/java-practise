package com.games.constants;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.dropwizard.jackson.Jackson;

public class TambolaConstant {

    private TambolaConstant() {
    }

    public static final ObjectMapper OBJECT_MAPPER = Jackson.newObjectMapper();

    public static final class CollectionConstants {

        private CollectionConstants(){}

        public static final String BOARD_COLLECTION = "boards";

        public static final String CARD_COLLECTION = "cards";

        public static final String CELLS_COLLECTION = "cells";

        public static final String MATCHES_COLLECTION = "matches";

        public static final String USER_COLLECTION = "users";
    }

}
