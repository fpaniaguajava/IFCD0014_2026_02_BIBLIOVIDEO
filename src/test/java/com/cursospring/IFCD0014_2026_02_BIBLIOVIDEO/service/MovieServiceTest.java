package com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.service;

import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.model.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MovieServiceTest {
    @Autowired
    MovieService ms;


    public void createMovie(){
        ms.saveMovie(new Movie("Pesadilla en Elm Street", "https://i.ytimg.com/vi/JMT0dqE-ozs/sddefault.jpg", "https://youtu.be/JMT0dqE-ozs?si=pNErWURoBLrJkPEe"));
    }

    @Test
    public void findAll(){
        List<Movie> movies = ms.getAllMovies();
        movies.forEach(movie -> {
            System.out.println(movie);
        });

    }
}