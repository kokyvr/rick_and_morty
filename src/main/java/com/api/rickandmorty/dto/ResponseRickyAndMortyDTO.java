package com.api.rickandmorty.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseRickyAndMortyDTO {
    private Long id;

    private String name;

    private String status;

    private String species;

    private String type;

    private String image;


}
