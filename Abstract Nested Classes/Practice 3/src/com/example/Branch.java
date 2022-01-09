package com.example;

public enum Branch {
	
	LA(" Basic "), BOSTON(" Loan "), BANGALORE(" Full "), MUMBAI(" Full ");
	
	String serviceLevel1;
	private Branch(String serviceLevel1) {
		this.serviceLevel1 = serviceLevel1;
	}
	
	public String getServiceLEvel() {
		
		return serviceLevel1;
	}

}
