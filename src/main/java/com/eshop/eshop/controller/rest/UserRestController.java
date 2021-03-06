package com.eshop.eshop.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eshop.eshop.encryption.CryptoConverter;
import com.eshop.eshop.model.entity.Role;
import com.eshop.eshop.model.entity.User;
import com.eshop.eshop.model.service.UserService;

@RestController
public class UserRestController {

	UserService userService;

	@Autowired
	public UserRestController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping(value = "users")
	public List<User> getUsers(){
		return userService.findAll();
	}
	
	@PostMapping(value = "register")
	public User registerUser(@RequestBody User user) {
		
		user.setUid(0l);
		
		user.setPassword(CryptoConverter.encrypt(user.getPassword()));
		
		user.addRole(Role.USER);
		
		userService.saveOrUpdateUser(user);
		
		return user;
	}
	
	@PutMapping(value = "editUser")
	public User editUser(@RequestBody User user) {
		
		user.setPassword(CryptoConverter.encrypt(user.getPassword()));
		
		user.addRole(Role.USER);
		
		userService.saveOrUpdateUser(user);
		
		return user;
	}
	
	@PutMapping(value = "hire")
	public User hireAnEmployee(@RequestBody User user) {
		
		user.setPassword(CryptoConverter.encrypt(user.getPassword()));
		
		user.addRole(Role.EMPLOYEE);
		
		userService.saveOrUpdateUser(user);
		
		return user;
	}
	
	@DeleteMapping(value = "deleteUser/{userId}")
	public String deleteUserById(@PathVariable("userId") Long uid) {
		
		User user = userService.findById(uid);
		
		if(user == null) {
			throw new RuntimeException("User id not fount - "+uid);
		}
		
		userService.deleteUserById(uid);
		
		return "Deleted user with Id -"+uid;
	}
}
