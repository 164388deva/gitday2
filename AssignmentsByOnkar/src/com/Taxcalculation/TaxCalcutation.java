package com.Taxcalculation;

import java.util.Scanner;

public class TaxCalcutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Tax=0;
System.out.println("enter the salary amount");
Scanner s=new Scanner(System.in);
int salary=s.nextInt();
if(salary >180000 && salary >300000) {
	Tax=(int) (0.1*salary);
	}
else if(salary>300001 && salary >500000) {
	Tax=(int) (0.2*salary);
	}
else if(salary>500000 && salary >1000000) {
	Tax=(int) (0.3*salary);
	}
System.out.println("Tax amount to be paid is"+Tax);
	}
}
