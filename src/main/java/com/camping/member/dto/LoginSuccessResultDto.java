package com.camping.member.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LoginSuccessResultDto extends LoginResultDto {

    private Long id;
    private String memberType;
    private String name;
    private String email;


    public LoginSuccessResultDto(Long id, String memberType, String name, String email ) {
        super(true);
        this.id = id;
        this.memberType = memberType;
        this.name = name;
        this.email = email;
        
    }
}
