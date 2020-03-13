package com.java.url.shortner.generator;

import com.java.url.shortner.dto.GeneratorResponse;
import com.java.url.shortner.enums.GenerationStrategy;

public class HashCodeGeneration implements GeneratorAction {
    @Override
    public GeneratorResponse generate(String baseUrl) {
        GeneratorResponse generatorResponse = new GeneratorResponse();
        generatorResponse.setHashType(GenerationStrategy.CustomHashGeneration);
        generatorResponse.setHashCode("kfhfkdshkf");
        return generatorResponse;
    }
}
