package com.camping.member.dto;

import com.camping.member.model.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberSignOnDto extends Member {

    private String memberType;
    private String name;
    private String nickname;

    private String email;
    private String password;

    private String cellNumber;
    private String bizNumber;
    private String grade;

    private boolean deleteYn;

    //@Builder
    public MemberSignOnDto(String memberType, String name, String nickname, String email, String password, String cellNumber, String bizNumber, String grade, boolean deleteYn
    ) {
        this.memberType = memberType;
        this.name = name;

        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.cellNumber = cellNumber;
        this.bizNumber = bizNumber;
        this.grade = grade;
        this.deleteYn = deleteYn;
    }

    public Member toEntity() {
        return Member.builder()
                .memberType(memberType)                
                .name(name)                
                .nickname(nickname)
                .email(email)
                .password(password)
                .cellNumber(cellNumber)
                .bizNumber(bizNumber)
                .grade(grade)
                .deleteYn(deleteYn)
                .build();
    }



}





