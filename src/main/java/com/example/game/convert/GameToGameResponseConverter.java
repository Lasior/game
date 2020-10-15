package com.example.game.convert;

import org.springframework.core.convert.converter.Converter;

import com.example.game.dtos.response.GameResponse;
import com.example.game.entities.Game;

public class GameToGameResponseConverter implements Converter<Game, GameResponse> {

	public GameResponse convert(Game game) {
		GameResponse gameResponse = new GameResponse();
		gameResponse.setTitle(game.getTitle());
		gameResponse.setDate(game.getRelease());
		return gameResponse;
	}
}
