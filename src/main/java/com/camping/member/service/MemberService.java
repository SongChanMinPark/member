package com.camping.member.service;

import com.camping.member.dto.*;

import java.util.List;


public interface MemberService {
    Long singOn(MemberSignOnDto requestDto);
    Long save(MemberCreateRequestDto requestDto);
    //LoginResultDto login(MemberLoginRequestDto requestDto);
    LoginResultDto login(MemberLoginRequestDto requestDto);
    
    List<MemberResponseDto> findAllMember();
}
    
    

