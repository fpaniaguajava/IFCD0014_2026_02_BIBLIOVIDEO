package com.cursospring.IFCD0014_2026_02_BIBLIOVIDEO.model;

import jakarta.persistence.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String urlThumbnail;
    private String urlVideo;
    @ManyToOne
    @JoinColumn(name="id_genero")
    private Genre genre;

    public Movie() {
    }

    public Movie(String title, String urlThumbnail, String urlVideo, Genre genre) {
        this.title = title;
        this.urlThumbnail = urlThumbnail;
        this.urlVideo = urlVideo;
        this.genre = genre;
    }

    public Movie(int id, String title, String urlThumbnail, String urlVideo, Genre genre) {
        this.id = id;
        this.title = title;
        this.urlThumbnail = urlThumbnail;
        this.urlVideo = urlVideo;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlThumbnail() {
        return urlThumbnail;
    }

    public void setUrlThumbnail(String urlThumbnail) {
        this.urlThumbnail = urlThumbnail;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", urlThumbnail='" + urlThumbnail + '\'' +
                ", urlVideo='" + urlVideo + '\'' +
                ", genre=" + genre +
                '}';
    }
}
