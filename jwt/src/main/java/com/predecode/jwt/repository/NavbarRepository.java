package com.predecode.jwt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.predecode.jwt.entity.Navbar;

public interface NavbarRepository extends MongoRepository<Navbar, Integer>{

}
