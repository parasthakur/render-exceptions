package com.example.renderexceptions.Controllers;

import com.example.renderexceptions.CustomExceptions.CustomException2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

  @GetMapping("/api2")
  public void getApii() throws CustomException2 {
    throw new CustomException2();
  }
}
