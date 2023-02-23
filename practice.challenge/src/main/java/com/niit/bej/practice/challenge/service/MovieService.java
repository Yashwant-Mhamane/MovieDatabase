package com.niit.bej.practice.challenge.service;

import com.niit.bej.practice.challenge.domain.Movie;

import java.util.List;

public interface MovieService {
  Movie addMovie(Movie movie);

  List<Movie> getAllMovies();
}
