package com.cdac.training.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="employee")
public class Employee 
{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   
   @Column(name="employeedesc")
   private String desc;
   
   @Column(name="employeename")
   private String name;
   
   

   public Employee()
   {
	   
   }
   public Employee(int id, String name, String desc) {
	super();
	this.id = id;
	this.name = name;
	this.desc = desc;
	}
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", desc=" + desc + "]";
}


   
   
}
