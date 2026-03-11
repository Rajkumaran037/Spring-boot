package com.example.core.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

	private final UserAppService userService;

	@Autowired
	public UserController(UserAppService userService) {
        this.userService = userService;
    }

    @GetMapping("/home")
    public String home() {
        return "Welcome to our page!";
    }


}