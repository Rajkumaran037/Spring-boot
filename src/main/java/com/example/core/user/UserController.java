package com.example.core.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;
    // Spring Boot injects UserService automatically
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/home")
    public String home() {
        return "Welcome to our page!";
    }

    @GetMapping("/getUserFromPath{id}/{dummy}")
    public String getUserFromPath(@PathVariable long id,@PathVariable("dummy") long dummy) {
        return dummy+"Welcome Spring"+id;
    }


    @GetMapping("/getUserFromQuery")
    public User getUserFromQuery(@RequestParam("id") long id,@RequestParam("dummy") long dummy,@RequestParam("dummy1") long dummy1) {
        return userService.getUserById(id);
    }

    @PostMapping("/persistUser")
    public User persistUser(@RequestBody User user) {
        return userService.persistUser(user);
    }




}




