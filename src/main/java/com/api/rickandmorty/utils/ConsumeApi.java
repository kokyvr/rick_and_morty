package com.api.rickandmorty.utils;

import com.api.rickandmorty.dto.BodyRickyAndMorty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsumeApi<T> {

    @Autowired
    private  RestTemplate restTemplate;



    public T getApi(String url, Class<T> classType){

        return this.restTemplate.getForEntity(url,classType).getBody();
    }
}
