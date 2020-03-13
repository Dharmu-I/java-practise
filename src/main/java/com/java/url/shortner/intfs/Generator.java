package com.java.url.shortner.intfs;

import com.java.url.shortner.dto.GeneratorResponse;

public interface Generator {

    GeneratorResponse hashGenerate(String url);
}
