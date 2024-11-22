package com.hexaware.ctms.exception;
/*@Author: Arghya Mandal
* Date: 2024-11-22
*/
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(PlayerNotFoundException.class)
	public ResponseEntity<String> handlePlayerNotFoundException(PlayerNotFoundException e){
		String error = e.getMessage();
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	
}
