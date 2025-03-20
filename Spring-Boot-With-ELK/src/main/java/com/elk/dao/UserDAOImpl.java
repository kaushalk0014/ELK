package com.elk.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.elk.entiry.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO{

	private static final Logger logger = LogManager.getLogger(UserDAOImpl.class);
	
	@Override
	public UserDTO getUserById(Integer id) {
		 logger.debug(" getUserById() id is :  "+id +logger.getClass());
		
		 List<UserDTO> users = getUsers();
		 if (users == null || users.isEmpty()) {
		        logger.warn("User   is empty with id "+ id);
		        return null;
		    }
		 
		 return getUsers()
				.stream()
				.filter(user-> user.getId().equals(id)).findFirst()
				.orElse(null);
				 
	}
	
	@Override
	public List<UserDTO> getAllUser() {
		logger.debug(" getAllUser() " +logger.getClass());
		return getUsers();
	}
	private List<UserDTO> getUsers(){
		Map<Integer, UserDTO> map=new HashMap<Integer, UserDTO>();
		map.put(101, new UserDTO(101, "Rakesh Kumar", "rakesh@gmail.com", "9966335588", 50000, "Developer"));
		map.put(102, new UserDTO(102, "Rohan", "rohan@gmail.com", "8855669955", 80000, "Tester"));
		map.put(103, new UserDTO(103, "Akssh r", "akashr@gmail.com", "7000223366", 70000, "HR"));
		map.put(104, new UserDTO(104, "Pankaj Roy", "pankajroy@gmail.com", "6588559910", 90000, "Developer"));
		map.put(105, new UserDTO(105, "deepak Kumar", "deepak@gmail.com", "8840152452", 70000, "Manager"));
		map.put(106, new UserDTO(106, "Sohan Singh", "sohansingh@gmail.com", "9965336622", 60000, "Tester"));
		map.put(107, new UserDTO(107, "Anil A", "anila@gmail.com", "8822000010", 90000, "HR"));
		map.put(108, new UserDTO(108, "kaushal kumar", "kaushalkumar@gmail.com", "8000022550", 60000, "Developer"));
		
		return map.values().stream().collect(Collectors.toList());
		
	}
}
