package com.gamesbragas.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamesbragas.dsList.entities.GamesList;

public interface GameListRepository extends JpaRepository<GamesList, Long> {

}
