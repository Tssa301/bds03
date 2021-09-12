package com.tssa301.bds03.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tssa301.bds03.services.DepartmentService;
import com.tssa301.bds03.bds03.dto.DepartmentDTO;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	@GetMapping
	public ResponseEntity<List<DepartmentDTO>> findAll() {
		List<DepartmentDTO> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
}
