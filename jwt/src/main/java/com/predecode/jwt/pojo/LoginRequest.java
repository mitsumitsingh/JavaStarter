package com.predecode.jwt.pojo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class LoginRequest {

	@NotBlank
	@NotNull
	private String email;

	@NotBlank
	@NotNull
	private String password;

}
