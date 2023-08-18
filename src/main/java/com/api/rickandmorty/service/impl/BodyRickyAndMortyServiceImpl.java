package com.api.rickandmorty.service.impl;

import com.api.rickandmorty.dto.BodyRickyAndMorty;
import com.api.rickandmorty.service.BodyRickyAndMortyService;
import com.api.rickandmorty.utils.ConsumeApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BodyRickyAndMortyServiceImpl implements BodyRickyAndMortyService {

    @Autowired
    private ConsumeApi<BodyRickyAndMorty> consumeApi;



    @Override
    public BodyRickyAndMorty getAll(String page) {

        return (BodyRickyAndMorty) this.consumeApi.getApi(page, BodyRickyAndMorty.class);
    }
}
