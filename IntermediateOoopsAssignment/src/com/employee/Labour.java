package com.employee;

public class Labour extends Employee {
	 public Labour(String EmployeeName,double EmployeeSalary){
		 super(EmployeeName,EmployeeSalary);
	 }
	@Override
	public double salaryCalculator(double ExtratimeAmount) {
		double SalryAfterIncrement=ExtratimeAmount+this.EmployeeSalary;
		return SalryAfterIncrement ;
		
	}

}