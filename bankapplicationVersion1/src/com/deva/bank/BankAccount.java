package com.deva.bank; //collection of logical classes

public class BankAccount {
	//static variable
	private static int autoAccountNo;
	
	//instance variables/class variable/these variables existence depends upon object or instance
private int accountNo;
private String accountHolderName;
private double accountBalance;

{
	// Init block//used to remove redundancy(i.e. repeated codes ) in constructors
	//init block gets executed before constructor 
	accountNo=++autoAccountNo;	
}
public BankAccount(){ //default constructor
	//constructor is used to initialize instance variables
	accountHolderName="unknow";
	accountBalance= 0;
}
public BankAccount(String accountHolderName,double accountBalance){//Parameterized constructor
	//constructor is used to initialize instance variables
	this.accountHolderName=accountHolderName;
	this.accountBalance= accountBalance;
}

public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;//Setters are used for modifying or reinitializing  the member variables
}
//getter methods
public double getAccountBalance() {
	return accountBalance;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public int getAccountNo() {
	return accountNo;
}
//service methods
public void withdraw(double amount){
	if(amount>this.accountBalance ) {
	System.out.println("withdraw balance is greater than account balance");
	}
	else if((this.accountBalance-amount)<1000){
		
		System.out.println("minimum 1000 account balance should be maintained");
	}
	else if(amount<=0){
		System.out.println("invalid amount");
		
	}
	else 
	{
	this.accountBalance-=amount;
    }
}



public void deposit(double amount){
	if(amount<=0){
		
		System.out.println("Enter valid amount");
	}
	else{
	this.accountBalance+=amount;
	}
}
public static void main(String [] args){
	BankAccount acc=new BankAccount();
	BankAccount acc2=new BankAccount("deva",50000);	
	acc2.withdraw(60000);
	double a=acc2.getAccountBalance();
	System.out.println(a);
	acc2.deposit(20000);
	 a=acc2.getAccountBalance();
	System.out.println(a);
}
}
