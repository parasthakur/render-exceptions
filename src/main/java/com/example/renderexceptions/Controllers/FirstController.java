package com.example.renderexceptions.Controllers;

import com.example.renderexceptions.CustomExceptions.CustomException1;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

  @GetMapping("/api1")
  public void getApi() throws CustomException1 {
    throw new CustomException1();
  }
}
