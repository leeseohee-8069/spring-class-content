package com.yonsai.SocialLogin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonsai.SocialLogin.entity.Member;
import com.yonsai.SocialLogin.repository.MemberRepository;

@Service
public class MemberService {
  // 로그인 데이터를 저장하는 데이터베이스 직원
  @Autowired
  MemberRepository 디비정보담당자;

  public String 로그인처리해줘(String id, String pw) {

    // 1. 로그! 클래스명 + 실행하는함수명
    // 넘어오는 값들 출력!
    // 2. 넘어온 값을 비교! 근데 비교하는 데이터는 어디서 가져오지?DB
    // 3. 디비담당자가 필요하네 있네! 데이터베이스 가서 확인좀해줄래?
    return "";
  }
}
