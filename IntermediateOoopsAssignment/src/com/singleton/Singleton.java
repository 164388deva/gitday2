package com.singleton;

public class Singleton {

	private static Singleton instance=null;
	public String str;
	public static int count;
	private Singleton(){
		str="created singleton object";
		System.out.println(count++);
	}
	
	public static  Singleton getInstance(){
		if(instance==null)
			instance=new Singleton(); 
		return instance;
		
	}
	
	public int getCount() {
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton singleObj=Singleton.getInstance();
System.out.println(" object created:"+singleObj.getCount());

Singleton singleObj1=Singleton.getInstance();
System.out.println(" object created:"+singleObj1.getCount());
	}

}
