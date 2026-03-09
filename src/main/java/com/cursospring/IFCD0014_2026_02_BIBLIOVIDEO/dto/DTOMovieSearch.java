package com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.dto;

public class DTOMovieSearch {
    private String searchTitle;
    private int genreId;

    public DTOMovieSearch() {
    }

    public DTOMovieSearch(String searchTitle, int genreId) {
        this.searchTitle = searchTitle;
        this.genreId = genreId;
    }

    public String getSearchTitle() {
        return searchTitle;
    }

    public void setSearchTitle(String searchTitle) {
        this.searchTitle = searchTitle;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }
}
