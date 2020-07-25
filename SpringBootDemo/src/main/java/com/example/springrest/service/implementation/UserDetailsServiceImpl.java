package com.example.springrest.service.implementation;

import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;

import org.apache.catalina.Group;
import org.apache.catalina.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.springrest.entity.User;
import com.example.springrest.entity.UserDetailsRepository;


public class UserDetailsServiceImpl implements UserDetailsService  {

@Autowired
UserDetailsRepository userDetailRepository;

@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	User  user = userDetailRepository.getUserByUsername(username);
	if(user == null )
		throw new UsernameNotFoundException("Cannot find the user with the given user name");
	return new CustomUserDetails(user);
		
}
}