package com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.service;

import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.model.Movie;
import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
