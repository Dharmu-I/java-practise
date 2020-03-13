package com.java.url.shortner.entity;

import com.java.url.shortner.enums.GenerationStrategy;

public class ShortUrlEntity {

    String coreUrl;

    String shortUrl;

    GenerationStrategy hashType;

    public String getCoreUrl() {
        return coreUrl;
    }

    public void setCoreUrl(String coreUrl) {
        this.coreUrl = coreUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public GenerationStrategy getHashType() {
        return hashType;
    }

    public void setHashType(GenerationStrategy hashType) {
        this.hashType = hashType;
    }
}
