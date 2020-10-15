package com.example.game.convert;

import org.springframework.core.convert.converter.Converter;

import com.example.game.dtos.request.GameRequest;
import com.example.game.entities.Game;

public class GameRequestToGameConverter implements Converter<GameRequest, Game> {
	public Game convert(GameRequest gameRequest) {
		Game game = new Game();
		game.setTitle(gameRequest.getTitle());
		game.setDescription(gameRequest.getDescription());
		game.setRelease(gameRequest.getRelease());
		return game;
	}
}
