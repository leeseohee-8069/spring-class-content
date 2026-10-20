package com.yonsai.FaceAndFate.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// 사주/관상 결과를 저장하는 타입
// 생년월일도 저장하고 결과도 저장하고 언제 봤는지?
// entity 폴더는 저장해야되는 데이터들이 모여있다.
// 각각 변수로 저장을 하면 여러 사람들이 중복되는
// 변수들이 생길 수도 있고 변수의 수가 기하급수적으로
// 생길 수있다. 그래서 한명의 사주 정보다!
// 클래스 묶어서 하나의 타입을 만든다.

@Entity // SqjuResult 자바클래스 파일을 DB테이블로 쓸거야!
public class SajuResult {

  // 대표키 primary key
  // @GeneratedValue 번호를 자동으로 저장해라!
  // GenerationType.IDENTITY mysql auto_increment 설정추가!
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  // 생년월일
  private LocalDate birthDate;

  // 결과
  @Column(length = 500) // varchar(500)
  private String aiResult;

  // 언제봤는지
  private LocalDateTime createAt = LocalDateTime.now();

  // 나중에 조회를 했을 때 카테고리 추가하면 좋다!

  public Long getId() {
    return id;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public String getAiResult() {
    return aiResult;
  }

  public LocalDateTime getCreateAt() {
    return createAt;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public void setAiResult(String aiResult) {
    this.aiResult = aiResult;
  }

  public void setCreateAt(LocalDateTime createAt) {
    this.createAt = createAt;
  }

  // 다른 폴더의 자바 클래스가 데이터를 수정하고 가져갈 수있게
  // setter,getter 만든다.

}
