package com.java.url.shortner.generator;

import com.java.url.shortner.dto.GeneratorResponse;

public interface GeneratorAction {

    GeneratorResponse generate(String baseUrl);
}
