package com.nissan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nissan.model.BasicInfo;

public interface BasicInfoRepository extends JpaRepository<BasicInfo, Long> {
    // Custom query methods (if needed)
}

