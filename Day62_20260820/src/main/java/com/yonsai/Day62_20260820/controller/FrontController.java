package com.yonsai.Day62_20260820.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontController {

  @GetMapping("/")
  public String index() {
    // 로그찍기
    System.out.println("FrontController - index() start");

    // 페이지 이동
    return "index";
  }

}
