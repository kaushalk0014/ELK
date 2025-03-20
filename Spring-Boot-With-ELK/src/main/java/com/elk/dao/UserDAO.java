package com.elk.dao;

import java.util.List;

import com.elk.entiry.UserDTO;

public interface UserDAO {

	UserDTO getUserById(Integer id);

	List<UserDTO> getAllUser();

}
