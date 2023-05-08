package com.example.smartwweb.security.repository;

import com.example.smartwweb.security.entity.ERole;
import com.example.smartwweb.security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);

}
