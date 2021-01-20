package com.predecode.jwt.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class RestApiController {
	
    private static Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@GetMapping("/all")
	public String allAccess() {
        logger.info("Accessing the public api's.");
        logger.debug("Accessing the public api's.");
		return "Public Content.";
	}
	

/*	
 
  	// Swagger Implementation
	@ApiOperation(
            value = "Rest end point exposed to check User Acess.",
            notes = "Check the user validity.",
            response = ResponseEntity.class )

    @ApiResponses({
        @ApiResponse(code = 200, message = "A 200 response implies server is responding successfully.", response = ResponseEntity.class),
        @ApiResponse(code = 404, message = "Rest end point might not be accurate.", response = ResponseEntity.class)

    })
	@ApiImplicitParams({
			  @ApiImplicitParam(name = "Authorization", value = "Access Token", required = true, allowEmptyValue = false, paramType = "header", dataTypeClass = String.class, example = "Bearer access_token"),
			  @ApiImplicitParam(name = "X-Custom-Header", value = "A Custom Header", required = true, allowEmptyValue = false, paramType = "header", dataTypeClass = String.class, example = "Header")
	})
	
*/
	
	@ApiImplicitParam(name = "Authorization", value = "Access Token", required = true, allowEmptyValue = false, paramType = "header", dataTypeClass = String.class, example = "Bearer access_token")
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public String userAccess() {
		return "User Content.";
	}

	@ApiImplicitParam(name = "Authorization", value = "Access Token", required = true, allowEmptyValue = false, paramType = "header", dataTypeClass = String.class, example = "Bearer access_token")
	@GetMapping("/mod")
	@PreAuthorize("hasRole('MODERATOR')")
	public String moderatorAccess() {
		return "Moderator Board.";
	}

	@ApiImplicitParam(name = "Authorization", value = "Access Token", required = true, allowEmptyValue = false, paramType = "header", dataTypeClass = String.class, example = "Bearer access_token")
	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Admin Board.";
	}
	
}
