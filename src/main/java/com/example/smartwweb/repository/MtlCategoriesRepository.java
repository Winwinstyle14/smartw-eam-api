package com.example.smartwweb.repository;

import com.example.smartwweb.entity.MtlCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlCategoriesRepository extends JpaRepository<MtlCategories,Long> {
}
