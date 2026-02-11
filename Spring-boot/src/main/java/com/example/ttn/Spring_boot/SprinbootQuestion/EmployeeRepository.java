package com.example.ttn.Spring_boot.SprinbootQuestion;


import com.example.ttn.Spring_boot.SprinbootQuestion.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}