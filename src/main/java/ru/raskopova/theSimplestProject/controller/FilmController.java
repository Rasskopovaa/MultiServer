package ru.raskopova.theSimplestProject.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.raskopova.theSimplestProject.model.Film;
import ru.raskopova.theSimplestProject.service.FilmService;

import java.util.List;

@RestController
@RequestMapping("/api/film")
public class FilmController {
    FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public ResponseEntity<List<Film>> getAllFilms() {
        List<Film> films = filmService.getFilms();
        return new ResponseEntity<>(films, HttpStatus.OK);
    }

    @GetMapping({"/{filmId}"})
    public ResponseEntity<Film> getFilm(@PathVariable Long filmId) {
        return new ResponseEntity<>(filmService.getFilmById(filmId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Film> saveFilm(@RequestBody Film film) {
        Film film1 = filmService.insert(film);
        return new ResponseEntity<>(film1, HttpStatus.CREATED);
    }

    @PutMapping({"/{filmId}"})
    public ResponseEntity<Film> updateFilm(@PathVariable("filmId") Long filmId, @RequestBody Film film) {
        filmService.updateFilm(filmId, film);
        return new ResponseEntity<>(filmService.getFilmById(filmId), HttpStatus.OK);
    }

    @DeleteMapping({"/{filmId}"})
    public ResponseEntity<Film> deleteFilm(@PathVariable("filmId") Long filmId) {
        filmService.deleteFilm(filmId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
