package com.example.core.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.core.user.UserPrinciple;
import com.example.core.user.UserRepository;
import com.example.core.user.Users;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("UserDetails-------->" + username);
		Users user = userRepository.findByName(username)
				.orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
		return new UserPrinciple(user);
	}

}
