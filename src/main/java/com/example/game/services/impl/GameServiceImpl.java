package com.example.game.services.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import com.example.game.dtos.request.GameRequest;
import com.example.game.dtos.response.GameResponse;
import com.example.game.entities.Game;
import com.example.game.exceptions.GameKONotFoundException;
import com.example.game.helper.GameHelper;
import com.example.game.repository.GameRepository;
import com.example.game.services.GameService;

@Service
public class GameServiceImpl implements GameService{
	
	@Autowired
	private GameHelper gameHelper;
	
	@Autowired
	private GameRepository gameRepo;
	
	@Autowired
	private ConversionService converter;

	@Override
	public GameResponse addGame(GameRequest gameRequest) {
		Game game = gameHelper.convertGameRequestToGame(gameRequest);
		gameRepo.save(game);
		return converter.convert(game, GameResponse.class);
	}
	
	@Override
	public GameResponse getGame(String title) {
		Optional<Game> game = gameRepo.findByTitle(title);
		
		if(game.isPresent())
			return converter.convert(game.get(), GameResponse.class);
		else 
			throw new GameKONotFoundException();
	}
}
