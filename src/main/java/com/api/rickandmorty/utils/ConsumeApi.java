package com.api.rickandmorty.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class ConsumeApi<T> {
    @Autowired
    private RestTemplate restTemplate;

    public  T getApi(String url,Class<T> classType){
        T response = this.restTemplate.getForObject(url,classType) ;
        return response;
    }
}
