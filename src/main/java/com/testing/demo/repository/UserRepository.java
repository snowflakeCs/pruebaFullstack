package com.testing.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testing.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}