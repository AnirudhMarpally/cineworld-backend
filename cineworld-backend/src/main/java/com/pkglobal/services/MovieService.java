package com.pkglobal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkglobal.entities.Movie;
import com.pkglobal.repository.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie updateMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(int movieId) {
        movieRepository.deleteById(movieId);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(int movieId) {
        return movieRepository.findById(movieId);
    }

	public List<Movie> getMoviesByTheatre(int theatreId) {
		// TODO Auto-generated method stub
		return movieRepository.findMoviesByTheatre(theatreId);
	}
}
