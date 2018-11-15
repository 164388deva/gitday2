package com.loginvalidation;

import java.util.Scanner;

public class LoginValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String username="System";String usern,pwd;
 String password="paassword";
 Scanner s1=new Scanner(System.in);
 for(int i=0;i<3;i++)
 {
 System.out.println("enter username");
 usern=s1.next();
 System.out.println("enter password");
 pwd=s1.next();
 if(usern == username && pwd == password) {
	 System.out.println("welcome");
	 i=3;System.out.println("welcome");
	 
	 
 }
 else if(i==2) {
	 System.out.println("contact admin");
	 
 }
 
 
	}
	}
}
