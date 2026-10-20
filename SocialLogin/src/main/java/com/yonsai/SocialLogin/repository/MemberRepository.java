package com.yonsai.SocialLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yonsai.SocialLogin.entity.Member;
import java.util.List;

// 너는 멤버들을 관리하는 데이터베이스 직원!
// 이 직원도 메뉴얼 습득! (JPA)
public interface MemberRepository
    extends JpaRepository<Member, Long> {
  // 자동으로 MemberRepository 중괄호 안에
  // save(),findAll(),delete() 기능이 자동으로 만들어진다.

  // MemberRepository 안에 내가 필요한 컬럼들 조회할 수있도록
  // 함수를 작성할 수있다.

  // JPA
  // SQL언어를 자동으로 만들어준다.
  // 기본 대표키에 대한 sql은 이미 자동으로 만들어놨다!
  // 나머지 컬럼들 없어요!
  // 필요하면 직접 만들어서 써라!

  // JPA 메서드규칙!
  // 따라서 직접 작성하는것! MemberRepository
  // findBy컬러명 *entity 타입 안에 변수명하고 일치*

  // select * from members where id=입력한아이디
  Member findById(String id);

  // 비밀번호로 조회하는 sql을 작성해라
  Member findByPw(String pw);

  // SQL 문장을 자바 메서드 이름으로 표현함
  // JPA SQL 쓰지말고 자바 답게 메서드로 DB에 명령해!
    }



