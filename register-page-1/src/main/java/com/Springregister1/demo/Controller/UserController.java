package com.Springregister1.demo.Controller;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springregister1.demo.Entity.User;
import com.Springregister1.demo.Service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	 @Autowired
	    private UserService userService;

	    @PostMapping("/register")
	    public ResponseEntity<User> register(@RequestBody User user) {
	        User registeredUser = userService.register(user);
	        return ResponseEntity.ok(registeredUser);
	    }

	    @PostMapping("/login")
	    public ResponseEntity<User> login(@RequestBody Map<String, String> credentials) {
	        String email = credentials.get("email");
	        String password = credentials.get("password");
	        Optional<User> user = userService.login(email, password);
	        if (user.isPresent()) {
	            return ResponseEntity.ok(user.get());
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	        }
	    }

}
