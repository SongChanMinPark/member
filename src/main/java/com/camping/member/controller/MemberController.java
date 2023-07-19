package com.camping.member.controller;


import com.camping.member.dto.MemberCreateRequestDto;
import com.camping.member.dto.MemberResponseDto;
import com.camping.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/members")
public class MemberController {
    private final MemberService memberService;

    @PostMapping
    public Long save(@RequestBody MemberCreateRequestDto requestDto) {
        return this.memberService.save(requestDto);
    }


    @GetMapping
    public List<MemberResponseDto> GetMember(){
        return this.memberService.findAllMember();
    }

}
