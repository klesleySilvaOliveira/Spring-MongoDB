package com.klesley.workshopmongo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klesley.workshopmongo.dto.UserDTO;
import com.klesley.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<UserDTO> findAll() {
		return repository.findAll().stream().map(user -> new UserDTO(user)).collect(Collectors.toList());
	}
}
