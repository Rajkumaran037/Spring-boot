package com.example.core.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAppService {

   private final UserRepository userRepository;

		@Autowired
    public UserAppService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users persistUser(Users user) {
        return  userRepository.save(user);
    }

		public Users getUserById(Integer id)
    {
			return userRepository.findById(id).map(user -> user).orElse(null);
    }
}
