package com.MakeStringUsingFirstLetter;

import java.util.ArrayList;
import java.util.function.Function;


public class stringDemo {
public static void main(String[] args) {

	ArrayList<String> length=new ArrayList<String>();
	length.add("deva");
	length.add("shiva");
	length.add("vishnu");
	length.add("sachin");
	length.add("karna");
	

   System.out.println(constructString(length,(i)->i.substring(0,1)));

	
}
static StringBuilder constructString(ArrayList<String> al,Function<String,String> p){
	StringBuilder sb = new StringBuilder();
	for(String i:al){
		sb.append(p.apply(i));
   
	}
	return sb;
 }
}
