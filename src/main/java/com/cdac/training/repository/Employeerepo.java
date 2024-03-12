package com.cdac.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.training.entity.Employee;

public interface Employeerepo extends JpaRepository<Employee, Integer> {

}
