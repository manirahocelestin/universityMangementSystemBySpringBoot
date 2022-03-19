package com.amazingapplication.wake.repo;

import com.amazingapplication.wake.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRep extends JpaRepository<Course,Long> {
}
