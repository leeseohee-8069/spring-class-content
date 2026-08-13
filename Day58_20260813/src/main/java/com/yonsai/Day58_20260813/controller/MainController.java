package com.yonsai.Day58_20260813.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 웹 서버 기능 만들기 
// 아래 @컨트롤러 달기! 
@Controller
public class MainController {

	// 메인페이지 보여줘!
	@GetMapping("/")
	public String main() {
		
		// url이 들어오면 index.html 파일 고객한테 보내줘!
		return "redirect:index.html";
	}

	// 소개페이지 보여줘!
	@GetMapping("/about")
	public String about() {
		
		// url이 들어오면 about.html 파일 고객한테 보내줘!
		return "redirect:about.html";
	}
}

/*
 *  AI를 사용해서 자동으로 스프링부트 프로젝트생성
 *  Agent - 나 대신 일해주는 기계!
 *  
 *  일반 AI는 채팅 일일이 하나씩 지시!
 *  일일 복붙해야된다. 그래서 불편하다!
 *  
 *  Agent 
 *   - 어떤 작업을 할지 작업지시서를 작성한다.
 *   - Markdown파일 md파일 AI들이 명확한 구조를 알 수있게 
 *     md파일로 준다!
 * 
 *   작업지시서를 작성할 때 
 *   1. Agent가 순서대로 처리할 수있도록 번호
 *     Task 1
 *     	 "뭘할지" + "어떻게 할지" + "됐는지 어떻게 확인할지"
 *     Task 2
 * 
 *   2.  버전,이름,경로 정확하게 작성해야함
 *   3.  md파일에서 ```이건 실행할 명령어다! ``` 코드 블록으로
 *      분리해서 작성한다.
 * 
 */




