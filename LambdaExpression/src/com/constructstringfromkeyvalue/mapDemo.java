package com.constructstringfromkeyvalue;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.function.Function;

public class mapDemo {

	
		public static void main(String[] args) {

			HashMap<String,String> names=new HashMap<String,String>();
			names.put("deva","Reddy");
			names.put("Koushik","Rao");
			names.put("Sunil","kumta");
			
			StringBuilder str=new StringBuilder();
		
			Function<Entry<String,String>,String> p=(i)->i.getKey()+i.getValue();
			
			for(Entry<String, String> i:names.entrySet()){
				     str.append(p.apply(i));
				}
	     System.out.println(str);
	      
		
			
		}
		
}
