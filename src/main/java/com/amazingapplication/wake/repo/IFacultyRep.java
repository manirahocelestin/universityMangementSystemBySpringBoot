package com.amazingapplication.wake.repo;

import com.amazingapplication.wake.domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacultyRep extends JpaRepository<Faculty,Long> {
}
