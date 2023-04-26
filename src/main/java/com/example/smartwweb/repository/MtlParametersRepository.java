package com.example.smartwweb.repository;

import com.example.smartwweb.entity.MtlParameters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlParametersRepository extends JpaRepository<MtlParameters,Long> {
}
