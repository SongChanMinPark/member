package com.camping.member.repository;


import com.camping.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
    

    @Query("SELECT m FROM Member m ORDER BY m.id DESC")
    List<Member> findAllMember();

}
