package com.app.fruits;

public class Orange extends Fruit{
	public String taste() {
	  String str="sour";
      return str;
    }
	public Orange() {
		
	}
	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color,weight,name,isFresh);
		System.out.println();
	}
}
