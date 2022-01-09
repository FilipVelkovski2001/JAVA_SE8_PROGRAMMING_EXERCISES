package com.example.domain;

public class EmployeeStockPlan {

	private Employee emp;
	private int stockOptions;
	
	public EmployeeStockPlan(Employee emp) {
		this.emp = emp;
		if(emp instanceof Director) {
			this.stockOptions = 1000;	
		}
		else if(emp instanceof Manager) {
			this.stockOptions = 100;
		}
		else {
			this.stockOptions = 10;
		}
	}
	
	public String toString() {
		return "Stock options: " + this.stockOptions;
	}
}
