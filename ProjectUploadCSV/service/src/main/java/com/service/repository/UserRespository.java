package com.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.model.User;

@Repository
public interface UserRespository extends JpaRepository<User, Integer>{

}
