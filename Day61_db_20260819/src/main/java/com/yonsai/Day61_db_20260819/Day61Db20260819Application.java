package com.yonsai.Day61_db_20260819;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day61Db20260819Application {

	public static void main(String[] args) {
		SpringApplication.run(Day61Db20260819Application.class, args);
	}

}

/*
 * 프로젝트에 mysql db를 다운로드 받는 순간!
 * 서버! 모든 설정을 마무리해야된다.
 * 서버 -> mysql 연결할 정보 어딨어? (url,user,password) 내가 자동으로 연결해서
 * 디비 사용하게 해준다. (스프링이 연결 자동으로 해준다)
 * 
 * mysql 정보 설정
 * - application.properties 설정한다.
 * 
 * 
 */
