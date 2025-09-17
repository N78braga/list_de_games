package com.gamesbragas.dsList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamesbragas.dsList.dto.GamesListDTO;
import com.gamesbragas.dsList.entities.GamesList;
import com.gamesbragas.dsList.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GamesListDTO> findAll() {
        List<GamesList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GamesListDTO(x)).toList();
    }

}
