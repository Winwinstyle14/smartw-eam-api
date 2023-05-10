package com.example.smartwweb.repository;

import com.example.smartwweb.entity.CsiInstanceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsiInstanceStatusRepository extends JpaRepository<CsiInstanceStatus,Long> {
}
