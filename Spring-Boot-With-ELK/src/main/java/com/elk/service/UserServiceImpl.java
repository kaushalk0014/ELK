package com.elk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elk.dao.UserDAO;
import com.elk.entiry.UserDTO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;

	@Override
	public UserDTO getUserById(Integer id) {
		UserDTO dto = dao.getUserById(id);
		return dto;
	}
	
	@Override
	public List<UserDTO> getAllUser() {
		List<UserDTO> list= dao.getAllUser();
		return list;
	}
}
