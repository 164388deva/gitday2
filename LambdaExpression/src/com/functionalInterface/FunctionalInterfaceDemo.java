package com.functionalInterface;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(0);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(55);



		Supplier<Integer> helloStrSupplier = () -> new Integer(23);
		int num=helloStrSupplier.get();
		a.add(num);
		a.add(helloStrSupplier.get());
		eval(a,(i)->{if(i%2==0)return true;
		return false;});
		printALL(a, (i)->System.out.println(i));
		square(a,i->i*i);
	}



	static  ArrayList<Integer> square(ArrayList<Integer> a,Function<Integer,Integer> num ){
		for(Integer i:a){
			System.out.println( num.apply(i));
		}
		return null;

	}
	static boolean eval(ArrayList<Integer> al,Predicate<Integer> p){
		for(Integer i:al){
			System.out.println( p.test(i));
		}
		return false;
	}
	static void printALL(ArrayList<Integer> al,Consumer<Integer> p){
		for(Integer i:al){
			p.accept(i);
		}





	}
}


