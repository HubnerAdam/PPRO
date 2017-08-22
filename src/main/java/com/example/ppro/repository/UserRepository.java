package com.example.ppro.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ppro.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public Optional<User> findByUserName(String username);
    
}