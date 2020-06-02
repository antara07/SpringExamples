package com.wipro.spring.basics;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieConfig {
	
	@Autowired
	Movie movie;

	public Movie getMovie() {
		movie.setMovieId("MO01");
		movie.setMovieName("The Firm");
		movie.setMovieActor("Tom Cruise");
		return movie;
	}
}
