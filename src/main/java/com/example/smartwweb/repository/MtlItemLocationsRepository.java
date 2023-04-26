package com.example.smartwweb.repository;

import com.example.smartwweb.entity.MtlItemLocations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlItemLocationsRepository extends JpaRepository<MtlItemLocations,Long> {
}
