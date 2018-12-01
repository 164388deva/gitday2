package com.MakeUppperCase;

import java.util.ArrayList;
import java.util.function.Function;

public class StringUpperCase {
	public static void main(String[] args) {

		ArrayList<String> length=new ArrayList<String>();
		length.add("deva");
		length.add("shiva");
		length.add("vishnu");
		length.add("sachin");
		length.add("karna");
		
      length.replaceAll((str)->str.toUpperCase());
      System.out.println(length);
      
	  constructString(length,(i)->i.toUpperCase());

		
	}
	static void constructString(ArrayList<String> al,Function<String,String> p){
		
		for(String i:al){
			System.out.println(p.apply(i));
	   
		}
		
	 }
}
