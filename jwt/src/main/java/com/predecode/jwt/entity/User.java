package com.predecode.jwt.entity;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
	@Id
	private ObjectId _id;

	@Email(message = "Please Enter Valid Email Address")
	@Size(max = 50)
	@NotEmpty(message = "Email can't not be empty")
	@NotNull(message = "Email can't be null")
	private String username;

	@Size(max = 120)
	@NotEmpty(message = "Password can't not be empty")
	@NotNull(message = "Password can't be null")
	private String password;
	
	@Size(max = 25)
	@NotEmpty(message = "Name is Required")
	@NotNull(message = "Name can't be null")
	private String name;

	private Set<Role> roles = new HashSet<>();

	public User() {
	}

	public User(String username,String name, String password) {
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public String getId() {
		return _id.toHexString();
	}

	public void setId(ObjectId _id) {
		this._id = _id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}