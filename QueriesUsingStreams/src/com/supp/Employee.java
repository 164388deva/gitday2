package com.supp;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
	
private int empId;
//	 //EMPNO NUMERIC; 
private String empName;//	 ENAME VARCHAR(10),
private String job;//	 JOB   VARCHAR(9),
private int mgr;//	 MGR   NUMERIC(4), 
  private  LocalDate DOH; //	 HIREDATE DATE,
  private int salary; //	 SAL NUMERIC(7,2),        
  private int commission;                  //	 COMM NUMERIC(7,2),        
  private int deptId;//	 DEPTNO NUMERIC(2) CONSTRAINT DEPTNO_DEPT_FK REFERENCES DEPT(DEPTNO) 
public Employee(int empId, String empName, String job, int mgr, LocalDate d1,
		int salary, int commission, int deptId) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.job = job;
	this.mgr = mgr;
	DOH = d1;
	this.salary = salary;
	this.commission = commission;
	this.deptId = deptId;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", job=" + job
			+ ", mgr=" + mgr + ", DOH=" + DOH + ", salary=" + salary
			+ ", commission=" + commission + ", deptId=" + deptId + "]";
}
public int getEmpId() {
	return empId;
}
public String getEmpName() {
	return empName;
}
public String getJob() {
	return job;
}
public int getMgr() {
	return mgr;
}
public LocalDate getDOH() {
	return DOH;
}
public int getSalary() {
	return salary;
}
public int getCommission() {
	return commission;
}
public int getDeptId() {
	return deptId;
}

}
