package com.henrik.desafio3.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henrik.desafio3.entities.Client;
import com.henrik.desafio3.repositories.ClientRepository;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
	
	@Autowired
	private ClientRepository repository;
	
	@GetMapping
	public String test() {
		Optional<Client> result = repository.findById(1L);
		return result.get().getName();
	}

}
