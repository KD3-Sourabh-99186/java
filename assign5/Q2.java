package assign5;
import java.util.Scanner;

public class Q2 {
   public static boolean checkPalindrome(String str) {
	   int length=str.length();
	   boolean p=true;
	   for(int i=0; i<=length/2; i++) {
		   if(str.charAt(i)!=str.charAt(length-1-i))
			   p=false;
	   }
	   return p;
   }
   public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   System.out.print("Enter string :");
	   String str=sc.nextLine();
	   
	   if(checkPalindrome(str)) {
		   System.out.println("String is palindrome");
	   }
	   else {
		   System.out.println("String is not palindrome");
	   }
   }
}
