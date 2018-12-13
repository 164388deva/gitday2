package com.DesertShop;

public class IceCream extends DessertItem{
   private  int noOfIceCreams,noOfIceCreamsTook;
	@Override
	public double getcost(int num) {
		double amount=num*1;
		double tax=amount*0.1;
		  amount+=tax;
		return amount;
		// TODO Auto-generated method stub
		
	}

	public void addIceCream(int num) {
		// TODO Auto-generated method stub
		this.noOfIceCreams+=num;
	}

	public void addIceCreamToCart(int num) {
		// TODO Auto-generated method stub
		if(num>this.noOfIceCreams){
			System.out.println("There is only "+this.noOfIceCreams+" Ice Creams");
			
		}
		else {
			this.noOfIceCreams-=num;
			this.noOfIceCreamsTook+=num;
		}
	}
public int getNoOfIceCreamsTook() {
	return noOfIceCreamsTook;
	
}
}
