package com.example.smartwweb.repository;

import com.example.smartwweb.entity.CsiItemInstance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsiItemInstanceRepository extends JpaRepository<CsiItemInstance,String> {
}
