package br.com.microservices.orchestrated.inventoryservice.config.exception;

import br.com.microservices.orchestrated.orderservice.config.exception.ExceptionDetails;
import br.com.microservices.orchestrated.orderservice.config.exception.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionGlobalHandler {

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<?> handleValidationException(ValidationException exception) {
        var details = new ExceptionDetails(HttpStatus.BAD_REQUEST.value(), exception.getMessage());
        return new ResponseEntity<>(details, HttpStatus.BAD_REQUEST);
    }

}
