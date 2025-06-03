package dev.oldhoon.Movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository; 
    
    public List<Movie> allMovies() {
        return movieRepository.findAll(); //in mongorepository class 
    }

    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId); // findMovieByImdbId is a method in MovieRepository
    }
}
