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
        return  userRepository.save(user);
    }

    public User getUserById(Long id)
    {
        return userRepository.getUserById(id).map(user -> user).orElse(null);
    }

}
