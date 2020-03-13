package com.java.url.shortner.actions;

import com.java.url.shortner.dto.GeneratorResponse;
import com.java.url.shortner.entity.ShortUrlEntity;
import com.java.url.shortner.enums.GenerationStrategy;
import com.java.url.shortner.intfs.Convertor;
import com.java.url.shortner.intfs.Generator;
import com.java.url.shortner.request.ShortnerRequest;
import com.java.url.shortner.respone.ShortnerResponse;
import com.java.url.shortner.services.ShortenUrlService;

public class GenerateTinyUrlAction {

    Generator generator;
    Convertor convertor;
    ShortenUrlService shortenUrlService;

    public ShortnerResponse getShortUrl(ShortnerRequest shortnerRequest){
        String tinyUrl = "";
        int attempt=0;
        GeneratorResponse generatorResponse;
        do {
            generatorResponse = callGenerator(shortnerRequest.getBaseUrl());
            tinyUrl = getTinyUrl(shortnerRequest.getBaseUrl());
            attempt++;
        }while (shortenUrlService.isUrlAlreadyRegistered(tinyUrl) && GenerationStrategy.values().length >= attempt);
        shortenUrlService.registerTheUrl(buildShortUrlEntity(shortnerRequest, tinyUrl, generatorResponse.getHashType()));
        return buildShortnerResponse(shortnerRequest, tinyUrl);
    }

    private ShortnerResponse buildShortnerResponse(ShortnerRequest shortnerRequest, String tinyUrl){
        ShortnerResponse shortnerResponse = new ShortnerResponse();
        shortnerResponse.setActualUrl(shortnerRequest.getProtocal()+shortnerRequest.getBaseUrl());
        shortnerResponse.setActualUrl(shortnerRequest.getProtocal()+tinyUrl);
        return shortnerResponse;
    }

    private ShortUrlEntity buildShortUrlEntity(ShortnerRequest shortnerRequest, String tinyUrl,
                                               GenerationStrategy generationStrategy){
        ShortUrlEntity shortUrlEntity = new ShortUrlEntity();
        shortUrlEntity.setCoreUrl(shortnerRequest.getBaseUrl());
        shortUrlEntity.setShortUrl(tinyUrl);
        shortUrlEntity.setHashType(generationStrategy);
        return shortUrlEntity;
    }

    private GeneratorResponse callGenerator(String baseUrl) {
       return generator.hashGenerate(baseUrl);
    }

    private String getTinyUrl(String hashCode){
        return convertor.convert(hashCode).getTinyUrl();
    }
}
