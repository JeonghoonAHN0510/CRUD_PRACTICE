package com.jeonghoon.crud_practice.service;

import com.jeonghoon.crud_practice.model.mapper.MemberMapper;
import com.jeonghoon.crud_practice.model.repository.MemberRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;


} // class end
