package com.example.core.user;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import static com.example.core.user.User.*;
import javax.persistence.EntityManager;
import java.util.Optional;

@Repository
@Component
public class UserRepository  {

    private EntityManager entityManager;


    public Optional<User> findByName(String name)
    {
        return Optional.ofNullable( new JPAQueryFactory(entityManager).selectFrom(QUser.user).where(QUser.user.name.eq(name)).fetchFirst());

    }

    public User save(User user) {
        return user;
    }

    public Optional<User> getUserById(Long id) {
        return Optional.ofNullable(entityManager.find(User.class,id));
    }
}


