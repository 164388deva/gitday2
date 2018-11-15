package com.Intrestcalculator;
import java.lang.Math;

import java.util.Scanner;

public class InterestCalculator {
	public static void main (String argu[ ])
	{
	    int pr, rate, t, sim,com;
	    Scanner sc=new Scanner (System. in);
	    System.out.println("Enter the amount:");
	    pr=sc.nextInt();
	    System. out. println("Enter the No.of years:");
	    t=sc.nextInt();
	    System. out. println("Enter the Rate of  interest");
	    rate=sc.nextInt();
	    sim=(pr * t * rate)/100;
	    com=(int) (pr * Math.pow(1.0+rate/100.0,t) - pr);
	    System.out.println("Simple Interest="+sim);
	    System.out. println("Compound Interest="+com);
	   }
}
