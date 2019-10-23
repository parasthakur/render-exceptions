package com.example.renderexceptions.ExceptionHandler;

import com.example.renderexceptions.CustomExceptions.CustomException1;
import com.example.renderexceptions.CustomExceptions.CustomException2;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

  @ExceptionHandler(CustomException1.class)
  public ResponseEntity handleCustomException1(CustomException1 ce1) {
    Map<Integer,String> errorMap = new HashMap<>();
    errorMap.put(400,ce1.getMessage());
    return new ResponseEntity<>(errorMap, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(CustomException2.class)
  public ResponseEntity handleCustomException2(CustomException2 ce2) {
    Map<Integer,String> errorMap = new HashMap<>();
    errorMap.put(500,ce2.getMessage());
    return new ResponseEntity<>(errorMap, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}