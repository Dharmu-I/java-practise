package com.java.url.shortner.dto;

import com.java.url.shortner.enums.GenerationStrategy;

public class GeneratorResponse {

    String hashCode;

    GenerationStrategy hashType;

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public void setHashType(GenerationStrategy hashType) {
        this.hashType = hashType;
    }

    public String getHashCode() {
        return hashCode;
    }

    public GenerationStrategy getHashType() {
        return hashType;
    }
}
