package com.camping.member.dto;

import com.camping.member.model.Member;
import lombok.Getter;

@Getter
public class MemberResponseDto {

	
	private Long id;
	private String memberType;
    private String name;
    private String nickname;
    private String email;
    private String password;
    

    public MemberResponseDto(Member member) {
        this.id = member.getId();
        this.memberType = member.getMemberType();
        this.name = member.getName();
        this.nickname = member.getNickname();
        this.email = member.getEmail();
        this.password = member.getPassword();
    }    
}
