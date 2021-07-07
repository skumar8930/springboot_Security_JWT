package com.sandeep.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.jwt.mlodel.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}