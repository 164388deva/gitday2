package com.employee;

public class Manager extends Employee {
	 public Manager(String EmployeeName,double EmployeeSalary){
		 super(EmployeeName,EmployeeSalary);
	 }
	@Override
	public double salaryCalculator(double incentive) {
		return incentive+this.EmployeeSalary;
		
	}

}
