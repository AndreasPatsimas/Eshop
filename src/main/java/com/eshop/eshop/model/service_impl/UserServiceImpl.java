package com.eshop.eshop.model.service_impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.eshop.eshop.model.entity.User;
import com.eshop.eshop.model.service.UserService;
import com.eshop.eshop.model.dao.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findById(Long uid) {
		Optional<User> result = userRepository.findById(uid);
		
		User user = null;
		
		if(result.isPresent()) {
			user = result.get();
		}
		else {
			throw new RuntimeException("There is not a product with id - "+uid);
		}
		
		return user;
	}

	@Override
	public void saveOrUpdateUser(User user) {
		
		userRepository.save(user);
	}

	@Override
	public void deleteUserById(Long uid) {
		
		userRepository.deleteById(uid);
	}

}
