package com.yonsai.Day62_20260820.entity;

import jakarta.persistence.*;

// JPA
//  - 자바 말을 데이터베이스 말로 실시간 통역해주는 시스템!

@Entity
public class Like {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private int postId; // 어느 게시글에 눌렀는지?
  private String userId; // 누가 눌렀는지?
}
