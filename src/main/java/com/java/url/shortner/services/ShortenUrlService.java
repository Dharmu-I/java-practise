package com.java.url.shortner.services;

import com.java.url.shortner.entity.ShortUrlEntity;

public interface ShortenUrlService {
    boolean isUrlAlreadyRegistered(String tinyUrl);

    void registerTheUrl(ShortUrlEntity shortUrlEntity);
}
