package com.mathcode.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mathcode.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
