package com.yonsai.totalAuth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class SessionController {

  @PostMapping("/login")
  public String login(
      @RequestParam("id") String id,
      @RequestParam("pw") String pw,
      HttpSession 세션,
      Model model) {

    System.out.println("컨트롤러명: SessionController");
    System.out.println("메서드명: login");
    System.out.println("id: " + id);
    System.out.println("pw: " + pw);

    세션.setAttribute("id", id);
    세션.setAttribute("pw", pw);

    String 저장된Id = (String) 세션.getAttribute("id");
    String 저장된Pw = (String) 세션.getAttribute("pw");
    String msg = id.equals(저장된Id)
        &&
        pw.equals(저장된Pw) ? "로그인 성공" : "로그인실패";
    model.addAttribute("msg", msg);

    return "mypage";
  }

  @GetMapping("/")
  public String sessionPage(HttpSession 세션) {
    System.out.println("SessionController - sessionPage()");

    return "index";
  }

  // 세션 저장된 목록을 확인
  void 세션저장목록확인(HttpSession 세션) {

    // var 타입으로 자동으로 타입을 정한다.
    // 1. 세션 모든 내용 가져와!
    var 세션이름들 = 세션.getAttributeNames();

    // 2. 꺼낼 이름을 하나씩 꺼내오며 반복한다.
    while (세션이름들.hasMoreElements()) {
      // 3. 하나씩 꺼내!
      String 세션이름 = 세션이름들.nextElement();

      // 4. 이름 출력
      System.out.println(세션이름 + ":" + 세션.getId());
    }
  }
}

/*
 * 세션의 생존시간
 * 생성 (로그인) -> 사용 중(요청 마다 접근 시간 갱신) -> 만료(일정 시간 미사용)
 * -> 삭제(로그아웃)
 * 
 * 대체적으로 스프링부트 사용 기본적인 서버 만료 30분
 * 
 * 쿠키(Cookie)
 * - 서버가 브라우저에게 맡기는 작은 문자열 데이터!
 * - 브라우저가 저장해 두었다가 같은 서버에 요청할 때마다 자동으로
 * 돌려준다.
 * 
 * Cookie
 * - 요청 헤더 안에 Cookie값을 확인할수있다.
 * - 브라우저가 요청 헤더에 담아 "저장했던 거 돌려줄게" 보내는것!
 * 
 * 
 * 
 */