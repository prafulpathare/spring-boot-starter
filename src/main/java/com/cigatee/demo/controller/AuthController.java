package com.cigatee.demo.controller;

import java.awt.print.Book;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cigatee.demo.dto.AuthRequest;
import com.cigatee.demo.model.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(path = "/auth")
public class AuthController {

	@Operation(summary = "Authenticate user request")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "User authenticated", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = User.class)) }),
			@ApiResponse(responseCode = "404", description = "User not found", content = @Content) })
	@PostMapping
	public ResponseEntity<?> authenticate(@RequestBody AuthRequest request) {
		return ResponseEntity.status(HttpStatus.OK).body(new User());
	}
}
