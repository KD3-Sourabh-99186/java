package assign5;

import java.util.Scanner;

public class Q3 {
  public static int countWords(String str) {
	  //trim
	  str=str.trim();
	  
	  //split
	  String[] array=str.split(" ");
	  
	  //count
	  int count=0;
	  for(String s: array)
		  count++;
	  
	  //return count
	  return count;
  }
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  System.out.print("Enter string :");
	  String str=sc.nextLine();
	  
	  int count=countWords(str);
	  System.out.println("no of words in string are : "+count);
  }
}
