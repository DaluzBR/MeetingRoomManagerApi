package br.com.daluz.MeetingRoomManagerApi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> resourceNotFoundException(
            ResourceNotFoundException ex, WebRequest request){
        ErrorDetailsException errorDetailsException = new ErrorDetailsException(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetailsException, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> GlobalExceptionHandler(
            Exception ex, WebRequest request){
        ErrorDetailsException errorDetailsException = new ErrorDetailsException(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetailsException, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
