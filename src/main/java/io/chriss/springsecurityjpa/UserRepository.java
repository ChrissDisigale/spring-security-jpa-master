package io.chriss.springsecurityjpa;

import org.springframework.data.jpa.repository.JpaRepository;

import io.chriss.springsecurityjpa.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
