package com.capgemini.controller;

public class Employee {
	private String employeeIdNumber;
private String name;
private String department;
private double salary;
public Employee() {
	super();
}
public Employee(String employeeIdNumber, String name, String department, double salary) {
	super();
	this.employeeIdNumber = employeeIdNumber;
	this.name = name;
	this.department = department;
	this.salary = salary;
}
public String getEmployeeIdNumber() {
	return employeeIdNumber;
}
public void setEmployeeIdNumber(String employeeIdNumber) {
	this.employeeIdNumber = employeeIdNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
