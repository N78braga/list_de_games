package com.gamesbragas.dsList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamesbragas.dsList.dto.GameMinDTO;
//import com.gamesbragas.dsList.dto.GameMinDTO;
import com.gamesbragas.dsList.entities.Game;
import com.gamesbragas.dsList.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(g -> new GameMinDTO(g)).toList();

    }

}
