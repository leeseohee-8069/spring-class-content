package com.yonsai.Day62_20260820.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//게시글 한 건을 저장하는 자바 파일
// 제목, 내용, 조회수, 작성한 날짜
// 엔티티(entity)
//  테이블 자동 생성하는 폴더!
//  자바랑 mysql 연결해서 테이블 생성하는 폴더

// 테이터베이스에 저장할 때 테이블 이름 내가 직접 작성

// 테이블이름설정
@Table(name = "posts")

// 테이블 생성
@Entity
public class Post {

  // 숫자 증가 하는 auto_increment 설정
  // strategy 방식
  // GenerationType 생성방식
  // IDENTITY mysql auto_increment 쓸꺼야!
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private int id;
  private String title;
  private String content;
  private String create_at;

}
