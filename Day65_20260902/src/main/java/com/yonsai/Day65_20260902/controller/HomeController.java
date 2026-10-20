package com.yonsai.Day65_20260902.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.yonsai.Day65_20260902.service.ProductService;

@Controller
public class HomeController {
  @Autowired
  ProductService 서비스;

  @GetMapping("/")
  public String home() {
    return "index";
  }
}
