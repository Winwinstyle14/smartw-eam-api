package vhc.smartw.eam.security.repository;

import vhc.smartw.eam.security.entity.ERole;
import vhc.smartw.eam.security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);

}
