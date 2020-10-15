package com.example.game.services;

import com.example.game.dtos.request.GameRequest;
import com.example.game.dtos.response.GameResponse;

public interface GameService {

	public GameResponse addGame(GameRequest gameDto);
	
	public GameResponse getGame(String title);
}
