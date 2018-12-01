package com.supp;

public class Department {

             private int deptId;//	DEPTNO NUMERIC(2) CONSTRAINT DEPTNO_DEPT_PK PRIMARY KEY, 
           private String deptName;//	DNAME VARCHAR(14),
              private String Location;//	LOC VARCHAR(13)
			
              
              @Override
			public String toString() {
				return "Department [deptId=" + deptId + ", deptName="
						+ deptName + ", Location=" + Location + "]";
			}
			public Department(int deptId, String deptName, String location) {
				super();
				this.deptId = deptId;
				this.deptName = deptName;
				Location = location;
			}
			public int getDeptId() {
				return deptId;
			}
			public String getDeptName() {
				return deptName;
			}
			public String getLocation() {
				return Location;
			}
              
}
