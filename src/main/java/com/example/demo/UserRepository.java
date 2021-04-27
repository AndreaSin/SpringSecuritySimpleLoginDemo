package com.example.demo;

import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	public Optional<User> findByUserName(String userName) {
		// esempio senza db, ovviamente qui dovrebbe andare sulla tabella
		return Optional.of(new User(11, userName, "pass", true, "USER" ));
	}

}
