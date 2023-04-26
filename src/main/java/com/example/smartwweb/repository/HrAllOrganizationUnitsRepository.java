package com.example.smartwweb.repository;

import com.example.smartwweb.entity.HrAllOrganizationUnits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrAllOrganizationUnitsRepository extends JpaRepository<HrAllOrganizationUnits,Long> {
}
