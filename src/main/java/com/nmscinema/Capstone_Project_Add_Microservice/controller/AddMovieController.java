package com.nmscinema.Capstone_Project_Add_Microservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.nmscinema.Capstone_Project_Add_Microservice.model.Movie;
import com.nmscinema.Capstone_Project_Add_Microservice.repository.MovieRepository;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/movie")
public class AddMovieController {
	@Autowired
	MovieRepository repository;

	@GetMapping("/add")
	public Boolean addMovie(@RequestParam String name, @RequestParam String genre, @RequestParam String release,
			@RequestParam String time) {
		Movie movie = new Movie(null, name, genre, release, time);
		try {
			repository.save(movie);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@GetMapping("/delete")
	public Boolean deleteMovie(@RequestParam Integer mid) {
		try {
			repository.deleteById(mid);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@GetMapping("/update")
	public Boolean updateMovie(@RequestParam Integer mid, @RequestParam String name, @RequestParam String genre,
			@RequestParam String release, @RequestParam String time) {

		Movie movie = repository.findById(mid).orElseThrow();

		movie.setGenre(genre);
		movie.setName(name);
		movie.setReleaseDate(release);
		movie.setShowTime(time);

		repository.save(movie);

		return true;

	}
	
	@GetMapping("/sendAllMovies")
	public List<Movie> sendAllMovies(){
		List<Movie> list = (List<Movie>) repository.findAll();
		return list;
	}

}