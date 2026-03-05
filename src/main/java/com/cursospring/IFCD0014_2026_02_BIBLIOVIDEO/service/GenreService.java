package com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.service;

import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.model.Genre;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GenreService {
    public List<Genre> getAllGenres(){
        List<Genre> genres = new ArrayList<>();
        genres.add(new Genre(1, "Terror"));
        genres.add(new Genre(2, "Comedia"));
        genres.add(new Genre(3, "Acción"));
        genres.add(new Genre(4, "Musical"));
        return genres;
    }

}
