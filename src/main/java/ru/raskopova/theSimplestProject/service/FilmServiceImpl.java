package ru.raskopova.theSimplestProject.service;

import org.springframework.stereotype.Service;
import ru.raskopova.theSimplestProject.model.Film;
import ru.raskopova.theSimplestProject.repository.FilmRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class FilmServiceImpl implements FilmService {

    FilmRepository filmRepository;

    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public List<Film> getFilms() {
        List<Film> films = new ArrayList<>();
        filmRepository.findAll()
                .forEach(films::add);
        return films;
    }

    @Override
    public Film getFilmById(Long id) {
        return filmRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Film insert(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public void updateFilm(Long id, Film film) {
        Film filmFromDb = filmRepository.findById(id).orElseThrow(NoSuchElementException::new);
        filmFromDb.setName(film.getName());
        filmFromDb.setDescription(film.getDescription());
        filmRepository.save(filmFromDb);
    }

    @Override
    public void deleteFilm(Long filmId) {
        filmRepository.deleteById(filmId);
    }
}
