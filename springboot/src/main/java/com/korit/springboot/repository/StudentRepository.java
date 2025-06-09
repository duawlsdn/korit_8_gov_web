package com.korit.springboot.repository;

import com.korit.springboot.domain.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    void deleteById(Integer id);
}
