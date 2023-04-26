package com.example.smartwweb.repository;

import com.example.smartwweb.entity.FndFlexValueSets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FndFlexValueSetsRepository extends JpaRepository<FndFlexValueSets,Long> {
}
