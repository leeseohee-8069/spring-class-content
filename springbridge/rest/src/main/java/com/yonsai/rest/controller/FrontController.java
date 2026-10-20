package com.yonsai.rest.controller;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import com.yonsai.rest.dto.ExchangeDto;

// @RestContorller
// HTTP(웹 요청)데이터를 바로 
// 응답하는 컨트롤러!
// 프론트가 사용할 데이터를 제공하는
// 역할

// @CrossOrigin
// - 다른 주소에서 오는 요청을 허용하겠다는 어노테이션

@CrossOrigin
@RestController
public class FrontController {

  @GetMapping("/hello")
  public String hello() {
    return "안녕하세요";
  }

  @GetMapping("/login")
  public String login(@RequestParam("userId") String id) {

    if (id.equals("admin")) {
      return "true";
    }

    return "false";
  }

  // 인증키를 이용해서 데이터 전체 가져오기! 요청!
  private String apiKey = "https://oapi.koreaexim.go.kr/site/program/financial/exchangeJSON?authkey=oevS02SAC98Abv9ri8p3gGnONlbkBOOv&data=AP01";

  @GetMapping("/exchange")
  public String exchange() {

    // 1.통신을 위한 도구!
    RestClient 통신도구 = RestClient.create();

    // 2. 전송준비 보내기까지 완성
    // ParameterizedTypeReference
    // 응답 JSON배열을 ExchangeDto 목록으로 바꿔줘!
    List<ExchangeDto> 결과 = 통신도구.get()
        .uri(apiKey)
        .retrieve()
        .body(new ParameterizedTypeReference<List<ExchangeDto>>() {
        });

    System.out.println(결과);

    return "";
  }

}