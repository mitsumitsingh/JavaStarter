package com.predecode.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.predecode.jwt.entity.Navbar;
import com.predecode.jwt.repository.NavbarRepository;

@RestController
@RequestMapping("/rest")
public class NavbarController {
	
	@Autowired
	NavbarRepository navbarRepo;
	
	@GetMapping("/getNavbar")
	public List<Navbar> getNavbar(){
		return navbarRepo.findAll();
	}
	
	@PostMapping("/addNavbar")
	public Navbar addNavbar(@RequestParam(value="value") String value) {
		Navbar navbar = new Navbar();
		navbar.setValue(value);
		return navbarRepo.save(navbar);
	}
	
}
