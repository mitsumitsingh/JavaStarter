package com.predecode.jwt.pojo;

import java.util.List;

public class JwtResponse {

	private String token;
	private String type = "Bearer";
	private String id;
	private String name;
	private String email;
	private List<String> roles;

	public JwtResponse(String accessToken, String id, String username, String name, List<String> roles) {
		this.token = accessToken;
		this.id = id;
		this.email = username;
		this.name = name;
		this.roles = roles;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getRoles() {
		return roles;
	}
	
}
