package com.eshop.eshop.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eshop.eshop.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
