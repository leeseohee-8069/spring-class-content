package com.yonsai.Day60_20260818.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.yonsai.Day60_20260818.dto.Board;

// 게시글 보여줘! 웹 요청이 들어오면 실제 처리하는 클래스!
// 실제 일을 하는 클래스!
@Service
public class BoardService {

  // 메인페이지가 열릴때 게시글을 컨트롤러한테 보내야되야된다.
  // 번호,제목, 작성자,작성일, 조회수
  // 문제가 return 하나만 보낸다.
  // return index,return main,return "로그인성공"
  // 그래서 게시글 한개 정보를 묶어서 보낸다. new Board(번호,제목..)

  // 데이터를 저장도 하는 서비스 클래스!(오늘만)
  ArrayList<Board> list = new ArrayList<>();

  // BoardService객체를 생성하면 생성자에서 자동으로
  // 데이터를 저장한다.
  public BoardService() {
    list.add(new Board(1, "게시판 첫 글입니다", "관리자", "2026-08-08", 5));
    list.add(new Board(2, "안녕하세요 처음 인사드립니다", "정하은", "2026-08-09", 18));
    list.add(new Board(3, "스택오버플로우 활용법", "최유진", "2026-08-09", 29));
  }

  // 게시글 전체를 가져오는 함수
  public ArrayList<Board> selectAll() {
    return list; // 컨트롤러야 받아라!
  }

}
