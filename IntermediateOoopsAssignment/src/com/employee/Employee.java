package com.employee;

public abstract class Employee {
     private static int empid=0;
     private static double TotalSalaryOfAllEmployees;
	 private  int EmployeeId;
	 private String EmployeeName;
	 protected double EmployeeSalary;
	 public Employee(){
		 this.EmployeeId=++empid;
		 this.EmployeeName="unknown";
		 this.EmployeeSalary=0;
	 }
	 public Employee(String EmployeeName,double EmployeeSalary){
		 this.EmployeeId=++empid;
		 TotalSalaryOfAllEmployees+=EmployeeSalary;
		 this.EmployeeName=EmployeeName;
		 this.EmployeeSalary=EmployeeSalary;
		
	 }

	public static double getTotalSalaryOfAllEmployees() {
		return TotalSalaryOfAllEmployees;
	}
	public double getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.EmployeeSalary = employeeSalary;
	}

	public abstract double salaryCalculator(double amount);

	public double getSalary() {
		return EmployeeSalary;
	}

	public void setSalary(double salary) {
		this.EmployeeSalary = salary;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
}
