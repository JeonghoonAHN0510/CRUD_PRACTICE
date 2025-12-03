package com.jeonghoon.crud_practice.model.repository;

import com.jeonghoon.crud_practice.model.entity.UserEntity;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

} // interface end