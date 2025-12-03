package com.jeonghoon.crud_practice.service;

import com.jeonghoon.crud_practice.model.mapper.UserMapper;
import com.jeonghoon.crud_practice.model.repository.UserRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;


} // class end
