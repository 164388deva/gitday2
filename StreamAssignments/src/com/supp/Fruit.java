package com.supp;

public class Fruit {
private String name;
private String color;
private int price;
private int calories;
public Fruit(String name, String color, int price, int calories) {
	super();
	this.name = name;
	this.color = color;
	this.price = price;
	this.calories = calories;
}
@Override
public String toString() {
	return "Fruit [name=" + name + ", color=" + color + ", price=" + price
			+ ", calories=" + calories + "]";
}
public String getName() {
	return name;
}
public String getColor() {
	return color;
}
public int getPrice() {
	return price;
}
public int getCalories() {
	return calories;
}


}
