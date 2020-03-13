package com.java.url.shortner.generator;

import com.java.url.shortner.dto.GeneratorResponse;
import com.java.url.shortner.enums.GenerationStrategy;

import java.util.HashMap;
import java.util.Map;

public class GenerateHashByType {

    static Map<GenerationStrategy, GeneratorAction> generationStrategyGeneratorActionMap = new HashMap<>();

    static {
        generationStrategyGeneratorActionMap.put(GenerationStrategy.CustomHashGeneration, new HashCodeGeneration());
        generationStrategyGeneratorActionMap.put(GenerationStrategy.MurMurHash, new MurMurHashGeneration());
    }

    public GeneratorResponse generate(String baseUrl, GenerationStrategy generationStrategy) {
        return generationStrategyGeneratorActionMap.get(generationStrategy).generate(baseUrl);
    }
}
