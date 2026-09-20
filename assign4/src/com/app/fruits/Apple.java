package com.app.fruits;

public class Apple extends Fruit {
   	
   public String taste() {
	   String str="sweet and sour";
	   return str;
   }	
   public Apple() {
	   
   }
   public Apple(String color, double weight, String name, boolean isFresh) {
		super(color,weight,name,isFresh);
		System.out.println();
	}
}
