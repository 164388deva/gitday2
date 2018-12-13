package com.employee;

public class TestEmployee {

	public static void main(String[] args) {
		Manager m1=new Manager("Deva",50000);
		Labour l1=new Labour("karan",10000);
		System.out.println("manager"+m1.getEmployeeName()+"'s salary is"+m1.EmployeeSalary);
		
		System.out.println("manager"+m1.getEmployeeName()+"'s salary is"+m1.salaryCalculator(5000) +"after incentive");
		System.out.println("Labour"+l1.getEmployeeName()+"'s salary is"+l1.EmployeeSalary);
		System.out.println("Labour"+l1.getEmployeeName()+"'s salary is"+l1.salaryCalculator(1000) +"after incentive");
		System.out.println("Total salary is"+Employee.getTotalSalaryOfAllEmployees() );
	}

}
