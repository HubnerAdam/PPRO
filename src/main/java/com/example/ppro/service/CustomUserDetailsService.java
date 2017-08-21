package com.example.ppro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.example.ppro.model.CustomUserDetails;
import com.example.ppro.model.User;
import com.example.ppro.repository.UserRepository;
import com.example.ppro.repository.UserRoleRepository;


@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService{
	private final UserRepository userRepository;
	private final UserRoleRepository userRoleRepository;
	
	@Autowired
    public CustomUserDetailsService(UserRepository userRepository,UserRoleRepository userRoleRepository) {
        this.userRepository = userRepository;
        this.userRoleRepository=userRoleRepository;
    }
	
        
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByUserName(username);
		if(null == user){
			throw new UsernameNotFoundException("No user present with username: "+username);
		}else{
			List<String> userRole=userRoleRepository.findRoleByUserName(username);
			return new CustomUserDetails(user,userRole);
		}
	}
		
}