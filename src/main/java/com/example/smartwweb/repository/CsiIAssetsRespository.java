package com.example.smartwweb.repository;

import com.example.smartwweb.entity.CsiIAssets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsiIAssetsRespository extends JpaRepository<CsiIAssets,Long> {
}
