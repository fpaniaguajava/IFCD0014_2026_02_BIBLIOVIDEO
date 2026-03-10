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
@RequestMapping("/movie/")
public class MovieController {
    private GenreService gs;
    private MovieService ms;
    public MovieController(GenreService gs, MovieService ms) {
        this.gs = gs;
        this.ms = ms;
    }

    @GetMapping("/create")
    public String createMovie(@ModelAttribute Movie movie, Model model) {
        model.addAttribute("genres", this.gs.getAllGenres());
        return "new-movie";
    }

    @PostMapping("/create")
    public String createMovie(@ModelAttribute Movie movie){
        this.ms.saveMovie(movie);
        return "redirect:/";
    }

    @GetMapping("/detail/{id}")
    public String showMovieDetail(@PathVariable int id, Model model) {
        Optional<Movie> movie = this.ms.findById(id);
        model.addAttribute("movie", movie);
        return "movie-detail";
    }

    @PostMapping("/search")
    public String searchMovie(@RequestParam String searchTitle, @RequestParam Integer searchGenre, Model model){
        List<Genre> genresList = gs.getAllGenres();
        List<Movie> moviesList = ms.findByTitleAndGenre(searchTitle, searchGenre);
        model.addAttribute("genres", genresList);
        model.addAttribute("movies", moviesList);
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteMovie(@PathVariable Integer id, Model model) {
        this.ms.deleteMovie(id);
        return "redirect:/";
    }
}
