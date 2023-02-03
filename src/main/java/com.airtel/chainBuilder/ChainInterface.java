package com.airtel.chainBuilder;


import io.gatling.javaapi.http.HttpRequestActionBuilder;

public interface ChainInterface{
    HttpRequestActionBuilder getHttpRequestActionBuilder();
    void execute();


}
