package com.app.fruits;

abstract public class Fruit extends Object {
	public String color;
	public double weight;
    public String name;
    public boolean isFresh;
    
    public Fruit() {
    	
    }
	public Fruit(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeigth(double weigth) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weigth=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof Fruit))
			return false;
	    String s=this.taste();
	    if(s==obj.toString())
	    	return true;
	    return false;
	}
    
    abstract public String taste();
}
