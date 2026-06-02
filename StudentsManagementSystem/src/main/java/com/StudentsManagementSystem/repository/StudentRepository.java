package com.StudentsManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.StudentsManagementSystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
