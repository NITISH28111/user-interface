package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.entity.Registration;
import com.example.service.RegistrationService;

@RestController
@RequestMapping("/ftp")
public class RegistrationController {
  @Autowired
  private RegistrationService registrationService;

  @PostMapping("/registration")
  public String registration(@RequestBody Registration registration) {
    registrationService.userRegistration(registration);
    return "User Registered Successfully";
  }
}
