package com.yonsai.Day61_db_20260819.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// JPA
//  - sql 코드 자동으로 작성해줌
//  - 테이블도 자동으로 생성해줌
//  데이터베이스에 관한 모든 내용은 자동화해줄래?!

// 내가 클래스로 틀 만들어놓을꼐 그대로 테이블 생성도 해줘!
//  테이블 생성기 대표키! 설정해달라 primary key 
@Entity
public class Person {

  // 대표키(PK)
  @Id
  private int id;

  private String name;
  private int age;
}

// 원래 @Column 변수들 위에 다 붙여야된다.
// JPA정해놓은 것 컬럼에 문자는 기본적으로 255하자!
// 데이터베이스는 대소문자 구별 안함!
// 그냥 스네이크 기법에 따라서 대문자가 들어가는 곳은 언더바로 표시!
