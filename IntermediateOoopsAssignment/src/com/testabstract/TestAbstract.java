package com.testabstract;

/*since we made startcounter method abstract we have to make class as abstract.
 * when me make method as abstract we hide implementation details of it ,so if we create a instance of it than there is 
 * no use of it.So we make class as abstract and it prevents it from creating object 
 * public class TestAbstract {
private static int counter;

public abstract void startcounter();



}*/
/*
public abstract class TestAbstract {
private static int counter;

public abstract void startcounter();
public static void mian(String [] args) {
	TestAbstract tc=new TestAbstract();
}


}*/

/* if we extend abstract either we should implement all the methods which we made abstract in parent class or we should make
 * child class as abstract
public  class ExtendAbstract extends TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void startcounter() {
		// TODO Auto-generated method stub
		
	}

}*/


/*if we make abstract class as private we cannot extend it 
 * 
 * 
 *
private abstract class TestAbstract {
private static int counter;

public abstract void startcounter();



}
*/

/*if we make abstract class as final than we cannot extend it. If we cannot able to extend the class than we cannot
 * fill the implementation details of methods which we made abstract in the abstract class
 * 
 *
final abstract class TestAbstract {
private static int counter;

public abstract void startcounter();



}
*/
/* we can make make a class abstract just to prevent creating objects of that class .for making class as abstract we don't 
 * need to have any abstract methods in it.

abstract class TestAbstract {
private static int counter;

public void startcounter(){
   this.counter++;
}


}*/

