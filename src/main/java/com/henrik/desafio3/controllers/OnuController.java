package com.henrik.desafio3.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.henrik.desafio3.dto.OnuDTO;
import com.henrik.desafio3.services.OnuService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/onus")
public class OnuController {
	
	@Autowired
	private OnuService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<OnuDTO> findById(@PathVariable Long id) {
		OnuDTO dto = service.findById(id);
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping
	public ResponseEntity<Page<OnuDTO>> findAll(Pageable pageable) {		
		Page<OnuDTO> dto = service.findAll(pageable);
		return ResponseEntity.ok(dto);
	}
	
	@PostMapping
	public ResponseEntity<OnuDTO> insert(@Valid @RequestBody OnuDTO dto) {		
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
}
