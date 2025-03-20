package com.elk.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elk.entiry.UserDTO;
import com.elk.service.UserService;

@RestController
public class UserController {

	private static final Logger logger = LogManager.getLogger(UserController.class);

	@Autowired
	private UserService service;

	@GetMapping("/user/byId")
	public ResponseEntity<UserDTO> getUserById(@RequestParam(name = "id") Integer id) {
		UserDTO userDTO = service.getUserById(id);
		logger.info("user details successfully get by id {} "+ userDTO);
		
		if(userDTO ==null) {
			logger.info("user not fount with id {} "+ id);
		}
		
		return new ResponseEntity<UserDTO>(userDTO, HttpStatus.OK);
	}

	@GetMapping("/user/getall")
	public ResponseEntity<List<UserDTO>> getAllUser() {
		
		List<UserDTO> list = service.getAllUser();
		logger.info("User details successfully get all {} "+ list);
		return new ResponseEntity<List<UserDTO>>(list, HttpStatus.OK);
	}

	// http://localhost:8080/user/byId?id=101
}
