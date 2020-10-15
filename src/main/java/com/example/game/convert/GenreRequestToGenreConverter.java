package com.example.game.convert;

import org.springframework.core.convert.converter.Converter;

import com.example.game.entities.Genre;
import com.example.game.enums.GenderEnum;

public class GenreRequestToGenreConverter implements Converter<GenderEnum, Genre> {
	
	public Genre convert(GenderEnum genreEnum) {
		Genre genre = new Genre();
		genre.setGenreName(genreEnum);
		return genre;
	}
}
