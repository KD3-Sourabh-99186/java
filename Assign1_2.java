import java.util.Scanner;
public class Assign1_2 {
   public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   double num1;
	   double num2;
	   System.out.println("Enter num1 : ");
	   if(!sc.hasNextInt()) {
		   if(sc.hasNextDouble()) {
			   num1=sc.nextDouble();
			   System.out.println("Enter num2 : ");
			   if(!sc.hasNextInt()) {
				   if(sc.hasNextDouble()) {
					   num2=sc.nextDouble();
					   System.out.println("Average is : "+(num1+num2)/2);
				   }
			   }
			   else {
				  System.out.println("Given num2 is not double");  
			   }
		   }
	   }
	   else {
		   System.out.println("given num1 is not double");
	   }
   }	   
}
