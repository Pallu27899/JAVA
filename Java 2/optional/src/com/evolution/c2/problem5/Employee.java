package com.evolution.c2.problem5;


public class Employee {

    private	int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;
	
	    public void calculateNetSalary(int pfpercentage) {
	        double pfAmount=(salary*pfpercentage)/100;
	        this.netSalary=salary-pfAmount;
	    }
	
	    public int getEmployeeId() {
	        return employeeId;
	    }
	
	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }
	
	
	    public String getEmployeeName() {
	        return employeeName;
	    }
	
	
	    public void setEmployeeName(String employeeName) {
	        this.employeeName = employeeName;
	    }
	
	
	    public double getSalary() {
	        return salary;
	    }
	
	
	
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	
	
	
	    public double getNetSalary() {
	        return netSalary;
	    }
	
	
	
	    public void setNetSalary(double netSalary) {
	        this.netSalary = netSalary;
	    }
	
	    public Employee() {
	        // TODO Auto-generated constructor stub
	    }



}