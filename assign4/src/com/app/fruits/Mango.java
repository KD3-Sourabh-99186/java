package com.app.fruits;

public class Mango extends Fruit {
	public String taste() {
	   String str="sweet";
       return str;
    }	
	public Mango(String color, double weight, String name, boolean isFresh){
		super(color,weight,name,isFresh);
		System.out.println();
	}
}
