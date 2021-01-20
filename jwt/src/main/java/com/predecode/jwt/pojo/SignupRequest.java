package com.predecode.jwt.pojo;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SignupRequest {
 
    @Email
    @Size(max = 50)
	@NotEmpty(message = "Email can't not be empty")
	@NotNull(message = "Email can't be null")
    private String email;
    
    private Set<String> role;
    
    @NotNull(message = "Password can't not be empty")
    @Size(min = 6, max = 40)
    private String password;
    
    @NotNull(message = "Name can't be null")
    @Size(min = 3, max = 25)
    private String name;
	
}
