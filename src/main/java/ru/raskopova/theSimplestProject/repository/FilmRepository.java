package ru.raskopova.theSimplestProject.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.raskopova.theSimplestProject.model.Film;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {
}
