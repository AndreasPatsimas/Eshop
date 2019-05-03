package com.eshop.eshop.model.service;

import java.util.List;

import com.eshop.eshop.model.entity.User;

public interface UserService {

	public List<User> findAll();
	
	public User findById(Long uid);
	
	public void saveOrUpdateUser(User user);
	
	public void deleteUserById(Long uid);
}
