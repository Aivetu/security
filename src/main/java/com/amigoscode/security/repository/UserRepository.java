package com.amigoscode.security.repository;

import com.amigoscode.security.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<com.amigoscode.security.user.User,Integer> {

    Optional<User> findByEmail(String email);
}
