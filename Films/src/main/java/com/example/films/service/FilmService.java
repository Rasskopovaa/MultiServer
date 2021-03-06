package com.example.films.service;


import com.example.films.model.Film;

import java.util.List;

public interface FilmService {
    List<Film> getFilms();

    Film getFilmById(Long id);

    Film insert(Film film);

    void updateFilm(Long id, Film film);

    void deleteFilm(Long filmId);
}
