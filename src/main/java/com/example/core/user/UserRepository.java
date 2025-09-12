package com.example.core.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


    public String getUserById(Long id) ;

    public User persistUser(User user) ;
}


