package com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.controller;

import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.model.Genre;
import com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.service.GenreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
    private GenreService gs;
    public MainController(GenreService gs) {
        this.gs = gs;
    }

    @GetMapping("/")
    public String getMainPage(Model model){
        List<Genre> genresList = gs.getAllGenres();
        model.addAttribute("genres", genresList);
        return "index";
    }
}
