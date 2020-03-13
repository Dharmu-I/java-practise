package com.java.url.shortner.generator;

import com.java.url.shortner.dto.GeneratorResponse;
import com.java.url.shortner.enums.GenerationStrategy;

public class MurMurHashGeneration implements GeneratorAction {

    @Override
    public GeneratorResponse generate(String baseUrl) {
        GeneratorResponse generatorResponse = new GeneratorResponse();
        generatorResponse.setHashType(GenerationStrategy.MurMurHash);
        generatorResponse.setHashCode("kfhfkdshkf");
        return generatorResponse;
    }
}
