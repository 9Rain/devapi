package com.dio.devapi.repository;

import com.dio.devapi.model.Dev;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevRepository extends JpaRepository<Dev, Long> {
}