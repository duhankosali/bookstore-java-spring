package com.oredata.bookStore.business.abstracts;

import org.springframework.http.ResponseEntity;

import com.oredata.bookStore.business.requests.CreateUserRequest;
import com.oredata.bookStore.entities.concretes.Users;

public interface UserService {
	Users getOneUserByEmail(String email);
	ResponseEntity<String> create(CreateUserRequest registerRequest);
}
