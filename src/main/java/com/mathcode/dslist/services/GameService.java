package com.mathcode.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mathcode.dslist.dto.GameMinDto;
import com.mathcode.dslist.entities.Game;
import com.mathcode.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	GameRepository gameRepository;
	
	
	public List<GameMinDto> findAll()
	{
		List<Game> result = gameRepository.findAll();
		List<GameMinDto> dto = result.stream()
				.map(x -> new GameMinDto(x)).toList();
		
		return dto;
	}
}
