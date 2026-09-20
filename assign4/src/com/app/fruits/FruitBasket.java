package com.app.fruits;
import java.util.Scanner;
public class FruitBasket {
   //used for case 4
   public static void displayName(Fruit[] basket) {
	   for(Fruit f : basket) {
		   if(f==null)
			   break;
		   System.out.printf("%s ",f.getName());
	   }
	   System.out.println();
   }
   
   //used for case 5
   public static void displayFresh(Fruit[] basket) {
	   for(Fruit f : basket) {
		   if(f==null)
			   break;
		   if(f.isFresh()==false)
			   continue;
		   System.out.println(f.getName()+" "+f.getColor()+" "+f.getWeight()+" Taste : "+f.taste());
	   }
	   System.out.println();
   }
   
   //used for case 6
   public static void displayStale(Fruit[] basket) {
	   for(Fruit f: basket) {
		   if(f==null)
			   break;
		   if(f.isFresh()==true)
			   continue;
		   System.out.println(f.getName()+" taste : "+f.taste());
	   }
	   System.out.println();
   }
   //used for case 8
   public static void markSourStale(Fruit[] basket) {
	   for(Fruit f: basket) {
		   if(f==null)
			   break;
		   String s1="sour";
		   String s2="sweet and sour";
		   if(f.taste().equals(s1) || f.taste().equals(s2))
			   f.setFresh(false);
	   }
	   System.out.println();
   }
   public static int menu() {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("enter choice : ");
	   System.out.println("0.Exit");
	   System.out.println("1.Add mango");
	   System.out.println("2.Add orange");
	   System.out.println("3.Add apple");
	   System.out.println("4.Display name of all fruits in basket");
	   System.out.println("5.Diaplay all fresh fuits");
	   System.out.println("6.Display taste of all stale fruits in basket");
	   System.out.println("7.Mark stale");
	   System.out.println("8.Mark all sour fruits stale");
	   int choice=sc.nextInt();
	   return choice;
   }
   public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   int n;
	   int counter =0;
	   int choice;
	   System.out.print("enter basket size : ");
	   n=sc.nextInt();
	   Fruit[] basket=new Fruit[n];
	   
	   while((choice=menu())!=0) {
		   switch(choice) {
		   case 1:{
			   if(counter>n)
				   System.out.println("can't be added basket full");
			   basket[counter++]=new Mango("yellow",0.25,"mango",true);
			   break;
		   }
		   case 2:{
			   if(counter>n)
				   System.out.println("can't be added basket full");
			   basket[counter++]=new Orange("Orange",0.20,"Orange",true);
			   break;
		   }
		   case 3:{
			   if(counter>n)
				   System.out.println("can't be added basket is full");
			   basket[counter++]=new Apple("red",0.20,"Apple",true);
			   break;
		   }
		   case 4:{
			   displayName(basket);
			   break;
		   }
		   case 5:{
			   displayFresh(basket);
			   break;
		   }
		   case 6:{
			   displayStale(basket);
			   break;
		   }
		   case 7:{
			   int i;
			   System.out.print("enter index : ");
			   i=sc.nextInt();
			   if(basket[i]==null) {
				   System.out.println("fruit at this index dont exist");
			       break;
			   }
			   basket[i].setFresh(false);
			   System.out.println();
			   break;
		   }
		   case 8:{
			   markSourStale(basket);
			   break;
		   }
		   }
	   }
	   
       System.out.println("thank you");
	   
   }
}
