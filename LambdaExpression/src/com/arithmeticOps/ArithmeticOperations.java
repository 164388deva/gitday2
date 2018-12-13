package com.arithmeticOps;

public class ArithmeticOperations {
public static void main(String[] args) {
	Arithmetic addition=(double a,double b)->a+b;
	Arithmetic subtrsction=(double a,double b)->a+b;
	Arithmetic multiplication=(double a,double b)->a+b;
	Arithmetic division=(double a,double b)->a+b;
System.out.println("addition:"+addition.operation(123.23, 1234.34));
System.out.println("multiplication:"+multiplication.operation(12.23, 1));
System.out.println("subtration:"+subtrsction.operation(123.23, 10.23));
System.out.println("division:"+division.operation(124.0, 2));
	
}
}
