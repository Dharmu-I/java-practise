package com.java.url.shortner.dao;

import com.java.url.shortner.entity.ShortUrlEntity;

public interface ShortenUrlDao {

    boolean isUrlAlreadyRegistered(String tinyUrl);

    void registerTheUrl(ShortUrlEntity shortUrlEntity);
}
