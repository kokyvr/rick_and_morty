package com.api.rickandmorty.service;

import com.api.rickandmorty.dto.BodyRickyAndMorty;
import com.api.rickandmorty.dto.InfoPage;

public interface BodyRickyAndMortyService {

    public static String url = "https://rickandmortyapi.com/api/character";
    public BodyRickyAndMorty getAll(String page);
}
