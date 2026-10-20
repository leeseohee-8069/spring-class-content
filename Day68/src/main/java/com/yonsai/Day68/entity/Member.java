package com.yonsai.Day68.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String memberId;
  private String password;

  // 간편로그인!
  private String provider; // 어디서 로그인했는지? 카카오,네이버,구글
  private String providerId; // 카카오/구글이 발급한 그 사람의 고유한 ID저장

  // 구글 id 12345678 각각 서버에서 사용하는 것 문제 없음!
  // 카카오 id 12345678

  // 내가 만든 사이트에서는 id값이 중복현상 확률!
  // String username = "kakao_12345678"
  // String username = "google_12345678"

  public Member() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
