package com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.repository;

import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.model.Genre;
import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.model.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IMovieRepositoryTest {

    @Autowired
    private IMovieRepository imr;

    void createMovie() {
        Movie movie = new Movie("Alien", "https://f.rpp-noticias.io/2015/02/19/1469647.jpg", "https://youtu.be/Eu9ZFTXXEiw?si=l6FrfyjnjQUZ6fKb", new Genre());
        this.imr.save(movie);
    }

    @Test
    void findAllMovies(){
        List<Movie> movies = imr.findAll();
        movies.forEach(movie -> {
            System.out.println(movie);
        });
    }


}