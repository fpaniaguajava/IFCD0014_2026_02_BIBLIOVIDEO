package com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.controller;

import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.model.Genre;
import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.model.Movie;
import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.service.GenreService;
import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class MainController {
    private GenreService gs;
    private MovieService ms;
    public MainController(GenreService gs, MovieService ms) {
        this.gs = gs;
        this.ms = ms;
    }

    @GetMapping("/")
    public String getMainPage(Model model){
        List<Genre> genresList = gs.getAllGenres();
        List<Movie> moviesList = ms.getAllMovies();
        model.addAttribute("genres", genresList);
        model.addAttribute("movies", moviesList);
        return "index";
    }

    /*
    @GetMapping("/createMovie")
    public String createMovie(Model model) {
        model.addAttribute(new Movie());
        return "new-movie";
    }
    */



//    @GetMapping("/createChapuzaGenre")
//    public String createGenre(Model model) {
//        for (int i=1;i<=10;i++) {
//            this.gs.createGenre(new Genre("Género " + i));
//        }
//        return "index";
//    }
}
