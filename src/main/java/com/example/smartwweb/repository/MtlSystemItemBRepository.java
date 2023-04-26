package com.example.smartwweb.repository;

import com.example.smartwweb.entity.MtlSystemItemB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlSystemItemBRepository extends JpaRepository<MtlSystemItemB,Long> {
}
