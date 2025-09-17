package com.gamesbragas.dsList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gamesbragas.dsList.dto.GameDTO;
import com.gamesbragas.dsList.dto.GameMinDTO;
import com.gamesbragas.dsList.entities.Game;
import com.gamesbragas.dsList.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);

    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(g -> new GameMinDTO(g)).toList();

    }

}
