package com.demo.project.webapplication.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.demo.project.webapplication.models.ExceptionResponse;


@ControllerAdvice
@RestController
public class MainController {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleException(Exception ex, WebRequest request) throws Exception {
		return new ResponseEntity<Object>(
				new ExceptionResponse(new Date(), ex.getMessage(), ex.getStackTrace().toString()),
				HttpStatus.INTERNAL_SERVER_ERROR);

	}
}
