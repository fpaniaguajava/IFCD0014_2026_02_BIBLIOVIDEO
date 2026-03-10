package com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.service;

import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.model.Movie;
import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    IMovieRepository imr;

    public void saveMovie(Movie movie) {
        imr.save(movie);
    }

    public List<Movie> getAllMovies(){
        return imr.findAll();
    }

    public Optional<Movie> findById(int id){
        Optional<Movie> movie = imr.findById(id);
        return movie;
    }

    public List<Movie> findByTitleAndGenre(String title, int idGenre) {
        if (idGenre==0) {
            List<Movie> movies = imr.findByTitleContaining(title);
            return movies;
        } else {
            List<Movie> movies = imr.findByTitleContainingAndGenreId(title, idGenre);
            return movies;
        }
    }

    public void deleteMovie(Integer id) {
        imr.deleteById(id);
    }
}
