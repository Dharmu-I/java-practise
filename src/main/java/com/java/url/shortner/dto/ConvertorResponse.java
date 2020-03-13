package com.java.url.shortner.dto;

public class ConvertorResponse {

    String tinyUrl;

    String convertionType;

    public String getTinyUrl() {
        return tinyUrl;
    }

    public void setTinyUrl(String tinyUrl) {
        this.tinyUrl = tinyUrl;
    }

    public String getConvertionType() {
        return convertionType;
    }

    public void setConvertionType(String convertionType) {
        this.convertionType = convertionType;
    }
}
