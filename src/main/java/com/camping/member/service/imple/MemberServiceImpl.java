package com.camping.member.service.imple;

import com.camping.member.dto.*;
import com.camping.member.model.Member;
import com.camping.member.repository.MemberRepository;
import com.camping.member.service.MemberService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
	
	private final MemberRepository memberRepository;

    @Override
    public Long singOn(MemberSignOnDto requestDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'singOn'");
    }    
        
    @Override
    @Transactional
    public Long save(MemberCreateRequestDto requestDto) {
        // 이미 등록된 Email이면 -1을 return하는 것이 API 스펙이라고 가정함
        Member savedMember = memberRepository.findByEmail(requestDto.getEmail()); // 혹은 Exists 함수를 사용할 수 있음
        if (savedMember != null) {
            return -1L;
        }

        return this.memberRepository.save(requestDto.toEntity()).getId();
    }

    @Override
    public LoginResultDto login(MemberLoginRequestDto requestDto) {
        Member savedMember = this.memberRepository.findByEmail(requestDto.getEmail());
        if (savedMember == null) {
            return new LoginResultDto(false); // 요구사항에 따라 다른 방법으로 구현할 수 있음
        }
        if (!savedMember.getPassword().equals(requestDto.getPassword())) {
            return new LoginResultDto(false); // 요구사항에 따라 다른 방법으로 구현할 수 있음
        }
        return new LoginSuccessResultDto(savedMember.getId(), savedMember.getMemberType(), savedMember.getName(), savedMember.getEmail());
    }
    
    @Override
    @Transactional
    public List<MemberResponseDto> findAllMember() {
        return this.memberRepository.findAllMember().stream()
                .map(MemberResponseDto::new)
                .collect(Collectors.toList());
    }
    
}
