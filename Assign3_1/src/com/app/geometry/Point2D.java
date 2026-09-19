package com.app.geometry;
import java.lang.Math;
public class Point2D {
   public double x;
   public double y;
   
   public double getX() {
	return x;
   }

   public void setX(double x) {
	this.x = x;
   }

   public double getY() {
	return y;
   }

   public void setY(double y) {
	this.y = y;
   }
   public Point2D() {
	   
   }
   //parameterized constructor
   public Point2D(int x, int y) {
	this.x = x;
	this.y = y;
   }
   
   //get details
   public String getDetails() {
		return "Point2D [x=" + x + ", y=" + y + "]";
   }
   
   //check if equal
   public boolean isEqual(Point2D p1) {
	   return this.x==p1.x && this.y==p1.y;
   }
   
   //calculate distance
   public double calculateDistance(Point2D p1) {
	      return Math.hypot((this.x-p1.x),(this.y-p1.y));
   }
}
