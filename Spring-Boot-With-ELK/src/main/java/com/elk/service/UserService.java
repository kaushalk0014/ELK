package com.elk.service;

import java.util.List;

import com.elk.entiry.UserDTO;

public interface UserService {

	UserDTO getUserById(Integer id);

	List<UserDTO> getAllUser();

}
