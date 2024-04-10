package com.dev.backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")
public class Hello {

       @GetMapping("/")
       public String hello(){
              return "Teste projeto" + new Date();
       }
}
