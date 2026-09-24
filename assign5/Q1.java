package assign5;
import java.util.Scanner;
public class Q1 {
  public static String reverseStr(String str) {
	  int length=str.length();
	  String rev=new String();
	  for(int i=length-1; i>=0; i--) {
		  Character t=str.charAt(i);
		  rev=rev.toString().concat(t.toString());
	  }
	  return rev;
  }
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  System.out.print("Enter string :");
	  String str=sc.nextLine();
	  
	  //reversing using user defined method
	  String rev1=reverseStr(str);
	  System.out.printf("origional string : %s\n",str);
	  System.out.printf("reversed string : %s\n",rev1);
	  
  }
}
