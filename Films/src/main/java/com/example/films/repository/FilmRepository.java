package com.example.films.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.films.model.Film;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {
}
