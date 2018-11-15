package com.StudentsmarksAverage;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]=new int[3];
		int Totalmarks,n=0;
    System.out.println("enter number of students");
    Scanner s=new Scanner(System.in);
    	 for(int i=0;i<3;i++) {
    		marks[i]= s.nextInt();
    		 Totalmarks=+marks[i];
    		 if(marks[i]>= 60) {
        		 n++;
    		 
    	 }
    	 }
    	if(n>2) {
    		System.out.println("passed");
    	}
    	else if(n==2) {
    		System.out.println("promoted");
    	}
    	else {
    		System.out.println("failed");
    	}
    	 }    		 
    	 }
    	
    
    
	


