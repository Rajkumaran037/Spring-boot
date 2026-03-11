package com.example.core.newuser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.core.request.SignInRequest;
import com.example.core.user.UserRepository;
import com.example.core.user.Users;

@RestController
@RequestMapping("/auth")
public class SignInOutController {

	@Autowired
	private UserRepository repo;
	@Autowired
	private BCryptPasswordEncoder encoder;

	@PostMapping("/signin")
	public ResponseEntity<String> home(@RequestBody SignInRequest request) throws Exception {
		System.out.println(request);
		if (repo.findByName(request.getName()).isPresent()) {
			return ResponseEntity.badRequest().body("User already exists!");
		}
		Users user = new Users(10, request.getRole(), request.getName(), encoder.encode(request.getPassword()));
		repo.save(user);
		return ResponseEntity.status(HttpStatus.OK).body("Welcome to our page!" + request);
	}

	@GetMapping("/listusers")
	public List<Users> listuser() {
		return repo.findAll();
	}

}
