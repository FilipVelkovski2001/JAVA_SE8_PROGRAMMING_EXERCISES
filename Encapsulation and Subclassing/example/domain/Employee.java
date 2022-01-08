package com.example.domain;

import java.text.NumberFormat;

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
    	this.empId = empId;
    	this.name = name;
    	this.ssn = ssn;
    	this.salary = salary;
    }
    public double raiseSalary(double salary) {
    	return this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }


    public String getSsn() {
        return ssn;
    }
    
    public void printEmployee() {
    	System.out.println("Employee name: "+ this.name);
    	System.out.println("ID: "+ this.empId);
    	System.out.println("Social Security number: "+ this.ssn);
    	System.out.println("Salary: "+ NumberFormat.getCurrencyInstance().format((double)(getSalary())));
    }


}
