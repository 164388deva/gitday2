package com.test;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import com.supp.Department;
import com.supp.Employee;

public class SqlDemo {

	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp=new ArrayList<Employee>();

		LocalDate d1=LocalDate.of(2018, 02, 20);

		emp.add(new Employee(7369,"SMITH","CLERK",7902,d1,800,0,20));
		emp.add(new Employee(7499,"ALLEN","SALESMAN",7698,LocalDate.of(1981,02,18),1600,300,30));
		emp.add(new Employee(7521,"WARD","SALESMAN",7698,LocalDate.of(1981,02,22),1250,1100,30));
		emp.add(new Employee(7566,"JONES","MANAGER",7839,LocalDate.of(1981,04,02),2975,0,20));
		emp.add(new Employee(7654,"MARTIN","SALESMAN",7698,LocalDate.of(1981,9,28),1250,1400,30));
		emp.add(new Employee(7698,"BLAKE","MANAGER",7839,LocalDate.of(1981,05,1),2850,0,30));
		emp.add(new Employee(7782,"CLARK","MANAGER",7839,LocalDate.of(1981,6,18),2450,0,10));
		emp.add(new Employee(7788,"SCOTT","ANALYST",7566,LocalDate.of(1987,04,11),3000,0,20));
		emp.add(new Employee(7839,"KING","PRESIDENT",0,LocalDate.of(1981,11,17),5000,0,10));
		emp.add(new Employee(7844,"TURNER","SALESMAN",7698,LocalDate.of(1981,9,8),1500,0,30));
		emp.add(new Employee(7876,"ADAMS","CLERK",7788,LocalDate.of(1987,05,23),1100,0,20));
		System.out.println(emp);
		ArrayList<Department> dept=new ArrayList<Department>();

		dept.add(new Department(10,"ACCOUNTING","NEW YORK"));
		dept.add(new Department(20,"RESEARCH","DALLAS"));
		dept.add(new Department(30,"SALES","CHICAGO"));
		dept.add(new Department(40,"OPERATIONS","BOSTON"));

		System.out.println(dept);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("All departments from department table");
		dept.stream().map(x->x.getDeptName()).distinct().forEach(x->System.out.println(x));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("All employees from employee table");
		emp.stream().map(x->x.getEmpName()).distinct().forEach(x->System.out.println(x));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("All employees from Dept id 30");
		emp.stream().filter(x->x.getDeptId()==30).map(x->x.getEmpName()).distinct().forEach(x->System.out.println(x));
		System.out.println("---------------------------------------------------------------------");
		System.out.println(" the names, numbers and department no of all clerks");
		emp.stream().filter(x->x.getJob().equals("CLERK")).forEach(x->System.out.println("Name:"+x.getEmpName()+"   Number:"+x.getMgr()+"  Department:"+x.getDeptId()));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("The depart numbers and the name of employee of all dept with Deptno greater or equal to 20");
		emp.stream().filter(x->x.getDeptId()>=30).forEach(x->System.out.println("Dept Id:"+x.getDeptId()+"   Name:"+x.getEmpName()));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("The employees whose commission is greater than their salary");
		emp.stream().filter(x->x.getCommission()>x.getSalary()).map(x->x.getEmpName()).forEach(x->System.out.println(x));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("the employees whose commission is greater than 60 percent of their salary");
		emp.stream().filter(x->x.getCommission()>0.6*x.getSalary()).map(x->x.getEmpName()).forEach(x->System.out.println(x));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("The employee whose commission is greater than 50 percent of their salary");
		emp.stream().filter(x->x.getCommission()>0.5*x.getSalary()).map(x->x.getEmpName()).forEach(x->System.out.println(x));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("List the name, job and salary of all employees in dept 20 who earn more than 2000");
		emp.stream().filter(x->x.getDeptId()==20 && x.getSalary()>2000).forEach(x->System.out.println("Name:"+x.getEmpName()+"   job:"+x.getJob()+"   Salary:"+x.getSalary()));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Find all salesmen in dept 30 whose salary is greater than or equal to Rs. 1500");
		emp.stream().filter(x->x.getJob().equals("SALESMAN") && x.getDeptId()==30 && x.getSalary()>1500).forEach(x->System.out.println("Name:"+x.getEmpName()+"   Number:"+x.getMgr()+"   Department:"+x.getDeptId()));
		System.out.println("---------------------------------------------------------------------");
		System.out.println(" All the employees whose job is either a president or manager");
		emp.stream().filter(x->x.getJob().equals("PRESIDENT")||x.getJob().equals("MANAGER")).forEach(x->System.out.println("Name:"+x.getEmpName()+"   Number:"+x.getMgr()+"  Department:"+x.getDeptId()));
		System.out.println("---------------------------------------------------------------------");
		System.out.println(" All managers who are not in dept 30");
		emp.stream().filter(x->x.getJob().equals("MANAGER")&& x.getDeptId()!=30  ).forEach(x->System.out.println("Name:"+x.getEmpName()+"   Number:"+x.getMgr()+"  Department:"+x.getDeptId()));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("The details of all managers and clerks in dept 10.");
		emp.stream().filter(x->x.getJob().equals("CLERK")||x.getJob().equals("MANAGER")&& x.getDeptId()==10).forEach(x->System.out.println("Name:"+x.getEmpName()+"   Number:"+x.getMgr()+"  Department:"+x.getDeptId()));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Find the details of all manager (in any dept) and all clerks in dept 10");
		emp.stream().filter(x->x.getJob().equals("MANAGER")||(x.getJob().equals("CLERK") && x.getDeptId()==10)).forEach(x->System.out.println("Name:"+x.getEmpName()+  "  Job:"+x.getJob()));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("The details of all managers in dept 10 and all clerks in dept 20.");
		emp.stream().filter(x->(x.getJob().equals("MANAGER")&& x.getDeptId()==10)||(x.getJob().equals("CLERK") && x.getDeptId()==20)).forEach(x->System.out.println(x));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("all employees who are neither clerks nor manager but whose salary is greater than or equal to Rs. 2000");
		emp.stream().filter(x->(!(x.getJob().equals("CLERK")&&x.getJob().equals("MANAGER")))&& x.getSalary()>=2000).forEach(x->System.out.println("Name:"+x.getEmpName()));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("The employees who earns between Rs. 1200 and Rs.1400");
		emp.stream().filter(x->x.getSalary()>1200 && x.getSalary()<1400 ).map(x->x.getEmpName()).forEach(x->System.out.println(x));
		System.out.println("---------------------------------------------------------------------");
		System.out.println("The employees who are clerks, analysts or salesman");
		emp.stream().filter(x->x.getJob().equals("ANALYST")||x.getJob().equals("MANAGER")||x.getJob().equals("SALESMAN")).forEach(x->System.out.println("Name:"+x.getEmpName()+"   Number:"+x.getMgr()+"  Department:"+x.getDeptId()));
		System.out.println("---------------------------------------------------------------------");
        System.out.println("The employees who are not clerks, analyst or salesman");
		emp.stream().filter(x->!(x.getJob().equals("ANALYST")||x.getJob().equals("MANAGER")||x.getJob().equals("SALESMAN"))).forEach(x->System.out.println("Name:"+x.getEmpName()));
		System.out.println("---------------------------------------------------------------------");
		System.out.println(" Employees who do not receive a commission i.e. commission is NULL.");
		emp.stream().filter(x->x.getCommission()==0).map(x->x.getEmpName()).forEach(x->System.out.println(x));

		
	}

}
