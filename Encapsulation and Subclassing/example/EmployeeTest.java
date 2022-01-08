package com.example;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee empOne = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        empOne.raiseSalary(122_445.29);
        empOne.printEmployee();
      
        Employee empTwo = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        empTwo.printEmployee();
        
        Employee empThree = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
        empThree.printEmployee();
        
        Employee empFour = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.23, "Global Marketing", 1_000_000.00);
        empFour.printEmployee();
    }
}