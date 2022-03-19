package com.amazingapplication.wake.repo;

import com.amazingapplication.wake.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRep extends JpaRepository<Student,Long> {
}
