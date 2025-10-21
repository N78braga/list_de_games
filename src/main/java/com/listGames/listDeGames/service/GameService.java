package com.listGames.listDeGames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.listGames.listDeGames.dto.GameMinDTO;
import com.listGames.listDeGames.repository.GamesRepository;

@Service
public class GameService {

    @Autowired
    private GamesRepository gamesRepository;

    public List<GameMinDTO> findAll() {
        var result = gamesRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

}
