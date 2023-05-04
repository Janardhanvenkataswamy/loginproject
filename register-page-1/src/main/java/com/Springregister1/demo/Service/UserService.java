package com.Springregister1.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springregister1.demo.Entity.User;
import com.Springregister1.demo.Repository.UserRepository;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


	public User register(User user) {
		// TODO Auto-generated method stub
        return userRepository.save(user);

	}


	public Optional<User> login(String email, String password) {
		// TODO Auto-generated method stub
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return user;
        } else {
            return Optional.empty();
        }
    }
	
}


