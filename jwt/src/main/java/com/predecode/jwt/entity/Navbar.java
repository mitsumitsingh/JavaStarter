package com.predecode.jwt.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "header")
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Navbar {
	
	@Id
	private int Id;
	
	private String value;
	
}
