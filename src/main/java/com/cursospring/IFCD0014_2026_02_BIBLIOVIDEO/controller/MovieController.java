package com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.controller;

import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.dto.DTOMovieSearch;
import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.model.Genre;
import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.model.Movie;
import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.service.GenreService;
import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class MovieController {
    private GenreService gs;
    private MovieService ms;
    public MovieController(GenreService gs, MovieService ms) {
        this.gs = gs;
        this.ms = ms;
    }

    @GetMapping("/createMovie")
    public String createMovie(@ModelAttribute Movie movie) {
        return "new-movie";
    }

    @PostMapping("/createMovie")
    public String createMovie(@ModelAttribute Movie movie, Model model){
        this.ms.saveMovie(movie);
        return "redirect:/";
    }

    @GetMapping("/movie-detail/{id}")
    public String showMovieDetail(@PathVariable int id, Model model) {
        Optional<Movie> movie = this.ms.findById(id);
        model.addAttribute("movie", movie);
        return "movie-detail";
    }

    @PostMapping("/searchMovie")
    public String searchMovie(@RequestParam String searchTitle, @RequestParam int searchGenre, Model model){
        List<Genre> genresList = gs.getAllGenres();
        List<Movie> moviesList = ms.findByTitleAndGenre(searchTitle, searchGenre);
        model.addAttribute("genres", genresList);
        model.addAttribute("movies", moviesList);
        return "index";
    }
}
