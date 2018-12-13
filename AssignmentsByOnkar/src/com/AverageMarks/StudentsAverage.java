package com.AverageMarks;

import java.util.Scanner;

public class StudentsAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	 int marks[][]=new int[3][3];
	 int Studentavg[]=new int[3];
	 
	 int Subjuctavg[]=new int[3];
	 
	 
	    for(int i=0;i<3;i++){
	    	System.out.println("Enter marks of 3 subjects of student "+(i+1));
		 for(int j=0;j<3;j++){
			 marks[i][j]=sc.nextInt();
			  } 
	    }
	    for(int i=0;i<3;i++){
			 for(int j=0;j<3;j++){
				 Studentavg[j]+=marks[i][j];
				 Subjuctavg[j]+=marks[j][i];
				  } 
			 
		    }
	    for(int j=0;j<3;j++){
			 Studentavg[j]/=3;
			 System.out.println("average of subject "+(j+1)+"is: "+Studentavg[j]);
			 
				System.out.println(" ");
				System.out.println(" ");
				Subjuctavg[j]/=3;
			 System.out.println("average of student "+(j+1)+"is: "+Subjuctavg[j]);
			 
			 System.out.println(" ");
				System.out.println(" ");
				} 
	   
	    
	}

}
