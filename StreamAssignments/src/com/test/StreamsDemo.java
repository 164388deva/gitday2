package com.test;

import java.util.ArrayList;
import com.supp.Fruit;
import com.supp.Trader;
import com.supp.Transaction;

public class StreamsDemo {

	public static void main(String[] args) {
		ArrayList<Fruit> fruit=new ArrayList<Fruit>();
		fruit.add(new Fruit("Apple","red", 100,150));
		fruit.add(new Fruit("Orange","orange", 50,50));
		fruit.add(new Fruit("Mango","green", 70,90));
		fruit.add(new Fruit("Tomato","red", 70,90));
		System.out.println("-----------------------------------------------------");
		System.out.println("fruits under 100 calories in descending order");	
		fruit.stream().filter(x->(x.getCalories()<100)).sorted((p1,p2)->{
			if(p1.getCalories()<p2.getCalories()){
				return 1;
			}
			return-1;}).forEach(x->System.out.println(x));
		System.out.println("-----------------------------------------------------");
		System.out.println("Grouped according to color");
		fruit.stream().sorted((p1,p2)->p1.getColor().compareTo(p2.getColor())).forEach(x->System.out.println(x.getColor()+" :"+x.getName() ));
		System.out.println("-----------------------------------------------------");

		System.out.println("Red colored fruits in ascending order");	
		fruit.stream().filter(x->(x.getColor().equals("red"))).sorted((p1,p2)->p1.getName().compareTo(p2.getName())).forEach(x->System.out.println(x));
	
		
		System.out.println("-----------------------------------------------------");

		ArrayList<Transaction> tr =new ArrayList<Transaction>();
		tr.add(new Transaction(new Trader("Deva", "Banglore"),2011,500000));
		tr.add(new Transaction(new Trader("Ranveer", "Pune"),2012,54000));
		tr.add(new Transaction(new Trader("Devansh", "Banglore"),2011,56000));
		tr.add(new Transaction(new Trader("Diwakar", "Mumbai"),2013,102000));
		tr.add(new Transaction(new Trader("Sachin", "Mumbai"),2011,15000));
		tr.add(new Transaction(new Trader("Kiara", "Pune"),2012,54000));
		tr.add(new Transaction(new Trader("Vaibhavi", "Pune"),2012,5000));
		tr.add(new Transaction(new Trader("Swetha", "Mumbai"),2011,15000));
		tr.add(new Transaction(new Trader("Koushik", "Delhi"),2011,15000));
		tr.add(new Transaction(new Trader("Mihir", "Delhi"),2011,1000));
		tr.add(new Transaction(new Trader("Sunil", "Indore"),2011,15000));
		StringBuilder str=new StringBuilder();
		System.out.println("All transactions in the year 2011 and sort them by value");
		tr.stream().filter(x->(x.getYear()==2011)).sorted((p1,p2)->{if(p1.getValue()>(p2.getValue())){
			return 1;
		}
		return -1;}).forEach(x->System.out.println(x));
		
		System.out.println("-----------------------------------------------------");
		System.out.println("What are all the unique cities where the traders work");
		tr.stream().map(x->x.getTrader().getCity()).distinct().forEach(x->System.out.println(x));
       System.out.println("-----------------------------------------------------");
		
       System.out.println("All traders from Pune and sorted them by name");
		tr.stream().filter(x->(x.getTrader().getCity().equals("Pune"))).sorted((p1,p2)->(p1.getTrader().getName().compareTo(p2.getTrader().getName()))
		).forEach(x->System.out.println(x.getTrader().getName()));
		
		System.out.println("-----------------------------------------------------");
		System.out.println("string of all traders names sorted alphabetically");
		tr.stream().sorted((p1,p2)->(p1.getTrader().getName().compareTo(p2.getTrader().getName()))
				).forEach(x->str.append(" "+x.getTrader().getName()));
				System.out.println(str);
		System.out.println("-----------------------------------------------------");
		System.out.println("Are any traders based in Indore?");
	if(tr.stream().filter(x->(x.getTrader().getCity().equals("Indore"))).findAny()!=null){
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	System.out.println("-----------------------------------------------------");	
	System.out.println("All transactions values from the traders living in Delhi");
	tr.stream().filter(x->(x.getTrader().getCity().equals("Delhi"))).forEach(x->System.out.println(x.getValue()));
	System.out.println("-----------------------------------------------------");	
	System.out.println("The highest value of all the transactions is");
	System.out.println(tr.stream().map(p1->p1.getValue()).sorted((p1,p2)->{if(p1<(p2)){
		return 1;
	}
	return -1;}).findFirst());
	System.out.println("-----------------------------------------------------");
	System.out.println(" Transaction with the smallest value is");
	System.out.println(tr.stream().map(p1->p1.getValue()).sorted((p1,p2)->{if(p1>(p2)){
		return 1;
	}
	return -1;}).findFirst());
	System.out.println("-----------------------------------------------------");


	
	}

	

}
