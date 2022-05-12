package com.devsuperior.movieflix.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.movieflix.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

	List<Movie> findAllById(Long id);

	@Query("SELECT obj "
			+ "FROM Movie obj "
			+ "WHERE :genreId = 0L OR obj.genre.id = :genreId "
			+ "ORDER BY obj.title")
	Page<Movie> find(Pageable pageable, Long genreId);

	
}
