package com.yonsai.Day65_20260902;

import java.util.List;

import org.springframework.ai.document.Document;
import org.springframework.ai.reader.pdf.PagePdfDocumentReader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.yonsai.Day65_20260902.service.AiService;

@SpringBootApplication
public class Day6520260902Application {

	public static void main(String[] args) {
		SpringApplication.run(Day6520260902Application.class, args);

		// 스프링부트가 실행할 때
		// 딱! 한번만 파일가져오기
		// PDF읽어오려면 도구가 필요하다

		// 1. pdf 읽기
		PagePdfDocumentReader reader = new PagePdfDocumentReader("classpath:/머신러닝_커리큘럼.pdf");

		// 2. 읽어드린 텍스트들을 Document 객체로 변환
		// 문서들은 대부분 실제 내용 존재 , 부가정보 (페이지번호,파일명,태그)
		// 위에 내용들을 자동으로 처리해준다.
		// 어떤 문서들이 오든지 똑같은 규칙으로 임베딩해야되서!
		// 문서들 = [Document(1페이지),Document(2페이지),Document(3페이지)]
		List<Document> 문서들 = reader.get();

		문서들.forEach(doc -> System.out.println(doc.getText()));
	}
}
/*
 * // 스프링부트에서 서버가 켜질때 딱 한번만 테스트용도
 * 
 * @Bean
 * public CommandLineRunner testRunner(AiService aiService) {
 * return args -> {
 * System.out.println("=== 질문하기 테스트 시작 ===");
 * float[] 결과 = aiService.숫자배열로변환중("스프링부트라는건 뭐더라? 디게 어려웠는데?");
 * System.out.println("결과 길이:" + 결과.length);
 * System.out.println("결과 값:" + java.util.Arrays.toString(결과));
 * 
 * System.out.println("=== 질문하기 테스트 끝 ===");
 * };
 * }
 * 
 * 
 * 
 * 
 */