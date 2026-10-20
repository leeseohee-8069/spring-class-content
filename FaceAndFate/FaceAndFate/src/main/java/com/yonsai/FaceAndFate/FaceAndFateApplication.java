package com.yonsai.FaceAndFate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // ** 알람 활성화(알람 켜키) **
public class FaceAndFateApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaceAndFateApplication.class, args);
	}

}

/*
 * 1. @EnableScheduling // ** 알람 활성화(알람 켜키) **
 * 2. @Scheduled 알람 설정
 * 3. @Component 스프링한테 알아서 관리해!
 * 가장 기본적으로 간단하게 볼 수있는 자동화!
 * 
 */