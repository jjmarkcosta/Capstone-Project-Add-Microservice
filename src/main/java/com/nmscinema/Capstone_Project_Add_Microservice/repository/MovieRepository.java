package com.nmscinema.Capstone_Project_Add_Microservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.nmscinema.Capstone_Project_Add_Microservice.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer>{

}
