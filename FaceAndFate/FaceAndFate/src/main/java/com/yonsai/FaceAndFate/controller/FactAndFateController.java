package com.yonsai.FaceAndFate.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yonsai.FaceAndFate.service.FaceAndFateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FactAndFateController {

  // 서비스연결
  @Autowired
  private FaceAndFateService 서비스;

  @GetMapping("/")
  public String mainPage() {
    return "index";
  }

  @PostMapping("/analyze")
  public String analyze(@RequestParam("image") MultipartFile image, String birth) {
    // 1.로그 찍음
    System.out.println("컨트롤러- analyze()");
    System.out.println("파일명:" + image.getOriginalFilename());

    // 2. 서비스한테 일 시키기
    서비스.AI질문답변처리(image, birth);

    return "index";
  }

  // /fortune url을 처리하는 함수
  // 1. 생년월일을 service로 넘기기
  // 2. service에서 넘어온 답변을 HTML 보내서 화면에 출력!
  @PostMapping("/fortune")
  public String fortune(String birth, Model 상자) {
    System.out.println("controller - fortune()");

    LocalDate 생년월일타입변경 = LocalDate.parse(birth);
    String 답변 = 서비스.오늘의운세(생년월일타입변경);

    상자.addAttribute("msg", 답변);

    return "index";
  }

}

/*
 * 
 * 1. FaceAndFateService 자바 파일을 컨트롤러에 연결!
 * 컨트롤러랑 서비스랑 연결 X (담당자 배정!)
 * 
 * 2. gpt 정보를 저장하는 코드!
 * 3. 채팅창 만들기 하는 코드!
 * 
 * 
 * 파일업로드
 * Current request is not a multipart request
 * - HTML 폼태그에서 파일들+문자 같이 여러 타입이 넘오는데
 * 일반 텍스트만 넘어간다. 파일업로드 요청이 아니다! 거부!
 * 
 * 실무에서는 고객입장에서 기다리는 시간이 1초이상 항상 로딩 페이지를
 * 만들어줘야된다.
 * 
 * 
 * MCP(Model Context Protocol)
 * - AI용 연결 멀티탭!
 * - AI연결하는 공통 약속(규칙)
 * github,Notion, 사내API, 메시전(슬랙),구글 드라이브
 * 
 */