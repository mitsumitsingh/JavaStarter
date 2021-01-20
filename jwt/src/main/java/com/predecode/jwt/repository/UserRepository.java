package com.predecode.jwt.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.predecode.jwt.entity.User;

public interface UserRepository extends MongoRepository<User,Integer>{

	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);
	
}
