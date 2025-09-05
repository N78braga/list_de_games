package com.gamesbragas.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamesbragas.dsList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
