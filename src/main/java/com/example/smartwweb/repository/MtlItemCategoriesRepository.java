package com.example.smartwweb.repository;

import com.example.smartwweb.entity.MtlItemCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlItemCategoriesRepository extends JpaRepository<MtlItemCategories,Long> {
}
