package com.oredata.bookStore.business.concretes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.oredata.bookStore.business.abstracts.UserService;
import com.oredata.bookStore.business.requests.CreateUserRequest;
import com.oredata.bookStore.dataAccess.abstracts.UserRepository;
import com.oredata.bookStore.entities.concretes.Users;

import lombok.AllArgsConstructor;

@Service // Business
@AllArgsConstructor
public class UserManager implements UserService {
	private UserRepository userRepository;
	private PasswordEncoder passwordEncoder;
	
	@Override
	public Users getOneUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public ResponseEntity<String> create(CreateUserRequest registerRequest){
		Users user = new Users();
		user.setEmail(registerRequest.getEmail());
		user.setName(registerRequest.getName());
		user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));	
		userRepository.save(user);
		
		return new ResponseEntity<>("User successfully registered.", HttpStatus.CREATED);
	}
	
}
