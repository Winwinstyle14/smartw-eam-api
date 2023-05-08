package com.example.smartwweb.security.repository;

import com.example.smartwweb.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User>findByUsername(String userName);
    //check username
    Boolean existsByUsername(String userName);
    //check email
    Boolean existsByEmail(String email);
}
