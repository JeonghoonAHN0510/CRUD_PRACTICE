package com.jeonghoon.crud_practice.model.repository;

import com.jeonghoon.crud_practice.model.entity.MemberEntity;

import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<MemberEntity, Integer> {

} // interface end