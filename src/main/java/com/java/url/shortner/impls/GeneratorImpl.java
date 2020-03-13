package com.java.url.shortner.impls;

import com.java.url.shortner.dto.GeneratorResponse;
import com.java.url.shortner.enums.GenerationStrategy;
import com.java.url.shortner.generator.GenerateHashByType;
import com.java.url.shortner.intfs.Generator;

import java.util.Random;

public class GeneratorImpl implements Generator {

    GenerateHashByType generateHashByType;

    @Override
    public GeneratorResponse hashGenerate(String url) {
        GenerationStrategy[] values = GenerationStrategy.values();
        int strategyId = new Random().nextInt(values.length);
        return generateHashByType.generate(url, values[strategyId]);
    }

}
