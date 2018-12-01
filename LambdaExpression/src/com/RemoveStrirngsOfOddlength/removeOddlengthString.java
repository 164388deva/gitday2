package com.RemoveStrirngsOfOddlength;

import java.util.ArrayList;


public class removeOddlengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> length=new ArrayList<String>();
		length.add("deva");
		length.add("shiva");
		length.add("vishnu");
		length.add("sachin");
		length.add("karna");
		length.removeIf((i)->i.length()%2!=0);
		System.out.println(length);
		
		
	}

}
