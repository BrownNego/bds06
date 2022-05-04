package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;

public class ReviewDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String text;
	
	private long movieId;
	private UserDTO user = new UserDTO();
	
	
	public ReviewDTO() {
		
	}

	public ReviewDTO(Long id, String text, long movieId) {
		this.id = id;
		this.text = text;
		this.movieId = movieId;
	}

	public ReviewDTO(Review entity) {
		id = entity.getId();
		text = entity.getText();		
	}
	
	public ReviewDTO(Review entity, Movie movie) {
		this(entity);
		this.movieId = movie.getId();
		this.user.setId(entity.getUser().getId());
		this.user.setName(entity.getUser().getName());
		this.user.setEmail(entity.getUser().getEmail());
		
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

}
