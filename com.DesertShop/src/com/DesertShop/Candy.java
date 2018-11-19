package com.DesertShop;

public class Candy extends DessertItem{
  private int noOfCandies;
private int noOfCandiesTook;
	@Override
	public double getcost(int number) {
		double amount=number*60;
		double tax=0.1*amount;
		amount+=tax;
		
		
		
		return amount;
		// TODO Auto-generated method stub
		
	}

	public void addCandy(int num) {
		// TODO Auto-generated method stub
		this.noOfCandies+=num;
	}

	public void addCandyToCart(int num) {
		// TODO Auto-generated method stub
		if(num>this.noOfCandies){
			System.out.println("There is only "+this.noOfCandies+" Ice Creams");
			
		}
		else {
			this.noOfCandies-=num;
			this.noOfCandiesTook+=num;
		}
	}
	public int getNoOfCandiesTook() {
		return noOfCandiesTook;
		
	}

}
