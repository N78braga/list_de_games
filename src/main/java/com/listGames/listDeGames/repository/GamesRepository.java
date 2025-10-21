package com.listGames.listDeGames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.listGames.listDeGames.entites.Games;

public interface GamesRepository extends JpaRepository<Games, Long> {

}
