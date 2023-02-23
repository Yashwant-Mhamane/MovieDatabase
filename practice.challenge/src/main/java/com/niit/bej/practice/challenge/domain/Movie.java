package com.niit.bej.practice.challenge.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Movie {
    @Id
    private long movieID;
    private String movieName;
    private String actorName;
    private String directorName;

    public Movie(long movieID, String movieName, String actorName, String directorName) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.actorName = actorName;
        this.directorName = directorName;
    }

    public Movie() {
    }

    public long getMovieID() {
        return movieID;
    }

    public void setMovieID(long movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return movieID == movie.movieID && Objects.equals(movieName, movie.movieName) && Objects.equals(actorName, movie.actorName) && Objects.equals(directorName, movie.directorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieID, movieName, actorName, directorName);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieID=" + movieID +
                ", movieName='" + movieName + '\'' +
                ", actorName='" + actorName + '\'' +
                ", directorName='" + directorName + '\'' +
                '}';
    }
}
