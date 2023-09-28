package com.nissan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nissan.model.AssetDetail;

public interface AssetDetailRepository extends JpaRepository<AssetDetail, Long> {
    // Custom query methods (if needed)
}


