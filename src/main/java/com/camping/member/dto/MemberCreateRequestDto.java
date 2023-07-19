package com.camping.member.dto;

import com.camping.member.model.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberCreateRequestDto {

	private String memberType;
    private String name;
    private String nickname;
    private String email;
    private String password;

    @Builder
    public MemberCreateRequestDto(String memberType, String name, String nickname, String email, String password) {
    	this.memberType = memberType;
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public Member toEntity() {
        return Member.builder()
        		.memberType(memberType)
                .name(name)
                .nickname(nickname)
                .email(email)
                .password(password)
                .build();
    }

}
