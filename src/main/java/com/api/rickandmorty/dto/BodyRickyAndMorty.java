package com.api.rickandmorty.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BodyRickyAndMorty {

    private InfoPage info;

    private ResponseRickyAndMortyDTO[] results;

    public InfoPage getInfo() {
        return info;
    }

    public void setInfo(InfoPage info) {
        this.info = info;
    }

    public ResponseRickyAndMortyDTO[] getResults() {
        return results;
    }

    public void setResults(ResponseRickyAndMortyDTO[] results) {
        this.results = results;
    }
}
