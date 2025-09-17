package com.gamesbragas.dsList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamesbragas.dsList.dto.GamesListDTO;
import com.gamesbragas.dsList.service.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListControlle {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GamesListDTO> findAll() {
        List<GamesListDTO> result = gameListService.findAll();
        return result;
    }

}
