package com.loginSignup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loginSignup.model.usersDetails;

public interface UserRepo extends JpaRepository<usersDetails, Integer>{

	public boolean existsByEmail(String email);

public usersDetails findByEmail(String email);

}
