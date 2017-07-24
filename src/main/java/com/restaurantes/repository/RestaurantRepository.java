package com.restaurantes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.restaurantes.domain.Restaurant;

@RepositoryRestResource(collectionResourceRel = "restaurant", path="restaurant")
@CrossOrigin(origins = "http://localhost:3000")
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
	
	Restaurant findById(@Param("id") String id);
	
}
