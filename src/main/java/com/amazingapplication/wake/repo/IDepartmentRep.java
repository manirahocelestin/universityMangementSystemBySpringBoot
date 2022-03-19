package com.amazingapplication.wake.repo;

import com.amazingapplication.wake.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRep extends JpaRepository<Department,Long> {
}
