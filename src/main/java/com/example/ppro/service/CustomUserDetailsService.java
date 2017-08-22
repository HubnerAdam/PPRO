package com.example.ppro.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.example.ppro.model.CustomUserDetails;
import com.example.ppro.model.User;
import com.example.ppro.repository.UserRepository;


@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService{
	/*	private final UserRepository userRepository;
	private final UserRoleRepository userRoleRepository;
	
	@Autowired
    public CustomUserDetailsService(UserRepository userRepository,UserRoleRepository userRoleRepository) {
        this.userRepository = userRepository;
        this.userRoleRepository=userRoleRepository;
    }
	*/
	@Autowired
	private UserRepository userRepository;
        
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optionalUser = userRepository.findByUserName(username);
			
		optionalUser.orElseThrow(() -> new UsernameNotFoundException("Uživatel nenalezen"));
		return optionalUser.map(CustomUserDetails::new).get();
				
		
	}
		
}