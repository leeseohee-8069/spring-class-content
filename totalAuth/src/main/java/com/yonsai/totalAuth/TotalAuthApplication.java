package com.yonsai.totalAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TotalAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(TotalAuthApplication.class, args);
	}

}
/*
 * HTTP 무상태 프로토콜
 * - 한번 요청한 내용에 대해서 응답이 오면 기억을 못한다
 * - 페이지마다 중요한 정보들을 계속 저장을 해서 사용해야된다.
 * - 서버는 이전 요청에 대한 내용을 모른다!
 * - 요청 때 마다 아이디,비밀번호를 계속 보내줘야된다. 불편하고 위함해요!
 * 로그인 상태를 유지하는 방법이 필요하다!
 * 
 * 1차 세션 , 쿠키
 * 세션(session)
 * - 인증정보를 서버 안에 저장한다.
 * - 서버 하나당 세션을 공간(메모리)
 * - 사용자의 상태를 기억하는 정보(연결정보, 상태)
 * - 단점은 A서버에서 로그인하면 그 기록이 다른 서버로 전달되지 않는
 * 문제가 있다.
 * 
 * 서버에 저장해야되는 경우
 * - 사용자가 맘대로 바꾸면 안되는 정보들을 서버에 저장한다.
 * - 로그인한 회원 ID
 * - 관리자 권한
 * - 예약,결제정보
 * 
 * 쿠키(Cookie)
 * - 인증정보를 내 컴퓨터에 저장한다
 * 
 * 
 */