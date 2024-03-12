package com.cdac.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.training.entity.Employee;
import com.cdac.training.repository.Employeerepo;

@RestController
@RequestMapping("/api")
public class EmployeeController 
{
	@GetMapping("/hello")
    public String sayhello()
    {
    	return "hello from springboot";
    }
	
	@Autowired
	Employeerepo repo;
	@GetMapping("/getall")
	public List<Employee> getallemp()
	{
		List<Employee> emp=repo.findAll();
		return emp;
	}
	
	@GetMapping("/getone/{id}")
	public Employee getoneemp(@PathVariable int id)
	{
		Employee emp=repo.findById(id).get();
		return emp;
	}
	
	@PostMapping("/create")
	public void create(@RequestBody Employee emp)
	{
		repo.save(emp);
	}
	
	@PutMapping("/update/{id}")
	public Employee update(@PathVariable int id)
	{
		Employee emp=repo.findById(id).get();
		emp.setName("manish");
		emp.setDesc("bhangri");
		repo.save(emp);
		return emp;
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		Employee emp=repo.findById(id).get();
		repo.delete(emp);
	}
	
}
