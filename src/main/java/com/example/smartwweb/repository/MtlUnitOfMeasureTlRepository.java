package com.example.smartwweb.repository;

import com.example.smartwweb.entity.MtlUnitOfMeasureTl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlUnitOfMeasureTlRepository extends JpaRepository<MtlUnitOfMeasureTl,String> {
}
