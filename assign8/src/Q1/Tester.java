package Q1;
import java.util.Scanner;
import java.lang.Object;

public class Tester {
   public static Scanner sc = new Scanner(System.in);
   public static int menu() {
	   System.out.println("1.Choose Fixed Stack");
	   System.out.println("2.Choose Growable Stack");
	   System.out.println("3.Push Data");
	   System.out.println("4.Pop Data");
	   System.out.println("5.Exit");
	   System.out.println("Enter Choice");
	   int choice = sc.nextInt();
	   return choice;
   }
   
   public static void acceptRecord(Object[] temp) {
	   System.out.println("enter emp id , name , salary respectively : ");
	   Integer id=sc.nextInt();
	   sc.nextLine();
	   String name=sc.nextLine();
	   Double salary = sc.nextDouble();
	   temp[0]=id;
	   temp[1]=name;
	   temp[2]=salary;
   }
   
   public static void main(String[] args) {
	   int choice;
	   Object[] temp = new Object[3];
	   Employee e;
	   Stack s=null;

	   while((choice=menu())!=5) {
		   switch(choice) {
		   case 1:{
			   if(s==null) {
			      s = new FixedStack();
			   }
			   else {
				  System.out.println("Stack already selected . now you cannot select stack");
			   }
			   break;
		   }
		   case 2:{
			   if(s==null) {
			      s = new GrowableStack();
			   }
			   else {
				   System.out.println("Stack already selected . now you cannot select stack");
			   }
			   break;
		   }
		   case 3:{
			   if(s!=null) {
				   if(s.status()) {
					   acceptRecord(temp);
					   Integer id=(Integer) temp[0];
					   String name=(String) temp[1];
					   Double salary=(Double) temp[2];
					   e=new Employee(id,name,salary);
					   s.push(e);
				   }
				   else {
					   System.out.println("push() falied . Stack Is Full ");
				   }
			   }
			   else {
				   System.out.println("No stack selected ");
			   }
			   break;
		   }
		   case 4:{
			   if(s!=null) {
			      e = s.pop();
			      if(e!=null) {
				     System.out.println(e.toString());
			      }
			      else {
				     System.out.println("pop() falied . Stack Is Empty ");
			      }
			   }
			   else {
				  System.out.println("No stack selected ");
			   }
			   break;   
		   }
		   }
	   }
   }
}
