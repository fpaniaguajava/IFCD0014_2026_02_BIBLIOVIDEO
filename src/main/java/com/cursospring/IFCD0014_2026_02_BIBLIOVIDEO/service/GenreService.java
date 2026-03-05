package com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.service;

import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.model.Genre;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GenreService {
    public List<Genre> getAllGenres(){
        List<Genre> generos = new ArrayList<>();
        generos.add(new Genre(1, "Terror"));
        generos.add(new Genre(2, "Comedia"));
        generos.add(new Genre(3, "Acción"));
        generos.add(new Genre(4, "Musical"));
        return generos;
    }

}
