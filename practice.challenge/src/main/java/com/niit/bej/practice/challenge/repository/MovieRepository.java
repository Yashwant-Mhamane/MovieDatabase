package com.niit.bej.practice.challenge.repository;

import com.niit.bej.practice.challenge.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

}
