package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositiory extends JpaRepository<User,Integer>{
	Optional<User> findUserByUsername(String username);
}
