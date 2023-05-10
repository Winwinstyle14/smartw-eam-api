package com.example.smartwweb.repository;

import com.example.smartwweb.entity.CsiIiGeolocations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsiIiGeolocationsRepository extends JpaRepository<CsiIiGeolocations,Long> {
}
