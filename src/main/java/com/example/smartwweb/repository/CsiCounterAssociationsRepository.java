package com.example.smartwweb.repository;

import com.example.smartwweb.entity.CsiCounterAssociations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsiCounterAssociationsRepository extends JpaRepository<CsiCounterAssociations,Long> {
}
