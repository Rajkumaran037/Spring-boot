package com.example.core.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
   private final UserRepository userRepository;
    // Spring Boot automatically injects UserRepository here
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User persistUser(User user) {
        System.out.println("user in service---"+user);
        return  userRepository.save(user);
    }
}
