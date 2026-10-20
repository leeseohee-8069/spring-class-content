package com.yonsai.Day68.repository;

import com.yonsai.Day68.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
