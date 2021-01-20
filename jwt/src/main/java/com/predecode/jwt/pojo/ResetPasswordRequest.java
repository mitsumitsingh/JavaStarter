package com.predecode.jwt.pojo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ResetPasswordRequest {
	
	@Email
    @Size(max = 50)
	@NotEmpty(message = "Email can't not be empty")
	@NotNull(message = "Email can't be null")
	private String email;
	
	@NotNull(message = "Password can't not be empty")
    @Size(min = 6, max = 40)
	private String currentPwd;
	
	@NotNull(message = "Password can't not be empty")
    @Size(min = 6, max = 40)
	private String newPwd;
	
}
