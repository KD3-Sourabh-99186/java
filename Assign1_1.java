import java.util.Scanner;
public class Assign1_1 {
   public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("java Test");
	   System.out.println("Enter number : ");
	   int num=sc.nextInt();
	   sc.nextLine();
	   
	   Integer i= new Integer(num); //auto boxing
	   System.out.println("Given number : "+ num);
	   System.out.println("Binary equivalent : "+Integer.toBinaryString(num));
	   System.out.println("Ocatl equivalent : "+Integer.toOctalString(num));
	   System.out.println("Hexadecimal equivalent : "+Integer.toHexString(num));
   }
}
