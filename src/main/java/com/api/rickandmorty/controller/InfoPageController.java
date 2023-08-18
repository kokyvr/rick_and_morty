package com.api.rickandmorty.controller;

import com.api.rickandmorty.dto.BodyRickyAndMorty;
import com.api.rickandmorty.service.BodyRickyAndMortyService;
import com.api.rickandmorty.utils.SplitQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class InfoPageController {

    @Autowired
    private BodyRickyAndMortyService service;

    @GetMapping
    public String getAll(Model model){
        BodyRickyAndMorty response = service.getAll(BodyRickyAndMortyService.url);
        model.addAttribute("results",response.getResults());
        String next = response.getInfo().getNext() != null ? SplitQuery.numberPage(response.getInfo().getNext()) : null;
        String prev = response.getInfo().getPrev() != null ? SplitQuery.numberPage(response.getInfo().getPrev()) : null;
        model.addAttribute("next", next);
        model.addAttribute("prev",prev);
        return "index";
    }
    @GetMapping("/{page}")
    public String getPageable(Model model,@PathVariable String page){
        String url = BodyRickyAndMortyService.url.concat( "?page="+page);
        BodyRickyAndMorty response = service.getAll(url);
        model.addAttribute("results",response.getResults());
        String next = response.getInfo().getNext() != null ? SplitQuery.numberPage(response.getInfo().getNext()) : null;
        String prev = response.getInfo().getPrev() != null ? SplitQuery.numberPage(response.getInfo().getPrev()) : null;
        model.addAttribute("next", next);
        model.addAttribute("prev",prev);
        return "index";
    }
}
