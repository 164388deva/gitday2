package com.DesertShop;

import java.util.Scanner;

public class DessertShop {

	public static void main(String[] args) {
		
		Candy cndy=new Candy();
		Cookie cuki=new Cookie();
		IceCream ic=new IceCream();
		
		// TODO Auto-generated method stub
		System.out.println("Select your role");
		System.out.println("1:Owner 2:Customer");
		Scanner sc =new Scanner(System.in);
		int role=sc.nextInt();
		int num;
		boolean loopterminate=true,loopterminate1=true;
		switch(role){
		case 1:while(loopterminate){
			  System.out.println("Select the dessert items to add");
			  System.out.println("1:candy 2:Cookie 3:IceCream 4:exit");
			  int dessertItemToAdd=sc.nextInt();
			  
			  switch(dessertItemToAdd){
			  case 1:System.out.println("enter number of candies to add");
				      num=sc.nextInt();
				     cndy.addCandy(num);
				 break;
			  case 2:
				  System.out.println("enter number of cookie to add");
			      num=sc.nextInt();
			      cuki.addCookie(num);
				  break;
			  case 3:
				  System.out.println("enter number of Ice cream to add");
			      num=sc.nextInt();
			     ic.addIceCream(num);
	                 break;			  
			  case 4:loopterminate=false;
				  break;  
		      default:System.out.println("entered invalid option");
			           break;
			  }
		       }
			
		case 2:while(loopterminate1){
			 System.out.println("Select the dessert items to add to cart");
			  System.out.println("1:candy 2:Cookie 3:IceCream 4:exit");
			  int dessertItemToAdd=sc.nextInt();
			  switch(dessertItemToAdd){
			  case 1:System.out.println("enter number of candies to add");
		      num=sc.nextInt();
		     cndy.addCandyToCart(num);
		 break;
	  case 2:
		  System.out.println("enter number of cookie to add");
	      num=sc.nextInt();
	      cuki.addCookieToCart(num);
		  break;
	  case 3:
		  System.out.println("enter number of Ice cream to add");
	      num=sc.nextInt();
	     ic.addIceCreamToCart(num);
             break;			  
	  case 4:loopterminate=false;
		  break;  
      default:System.out.println("entered invalid option");
	           break;
			  
			  
			  }
			
			
		     }
			
			
		default:System.out.println("entered invalid option");
		        break;
		}
		

		System.out.println("the total items you took are  ");
		System.out.println("Total candies took"+cndy.getNoOfCandiesTook());
		System.out.println("Total cost of candies"+cndy.getcost(cndy.getNoOfCandiesTook()));
		System.out.println("Total cookies took"+cuki.getNoOfCookiesTook());
		System.out.println("Total of cookies "+cuki.getcost(cuki.getNoOfCookiesTook()));
		System.out.println("Total IceCreams took"+ic.getNoOfIceCreamsTook());
		System.out.println("Total cost of ice creams"+ic.getcost(ic.getNoOfIceCreamsTook()));
		
		System.out.println("Total cash in rupees"+(ic.getcost(ic.getNoOfIceCreamsTook())+cuki.getcost(cuki.getNoOfCookiesTook()))+cndy.getcost(cndy.getNoOfCandiesTook()));
		
		
	}

}
