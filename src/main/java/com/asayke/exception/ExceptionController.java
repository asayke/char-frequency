package com.asayke.exception;

import com.asayke.controller.FrequencyController;
import com.asayke.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(assignableTypes = {FrequencyController.class})
public class ExceptionController {
    @ExceptionHandler({InputStringIsEmptyException.class})
    public ResponseEntity<ErrorDTO> handleInputIsEmpty(RuntimeException ex) {
        return new ResponseEntity<>(new ErrorDTO(ex.getLocalizedMessage()), HttpStatus.BAD_REQUEST);
    }
}