package Q1;
import java.util.Scanner;

public class longString {
		String inputString;
		
		longString(){
			this.inputString="";
		}
		longString(String inputString){
			this.inputString=inputString;
		}
		public void setinputString(String inputString) throws ExceptionLineTooLong
		{
			if(inputString.length()>80)
				 throw new  ExceptionLineTooLong();
	     	this.inputString=inputString;	
		}
		public String getinputString() {
			return inputString;
		}
		public String toString() {
			return "EXCEPTION :[ THE STRING IS TOO LONG]";
		}
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your string");
			String name=sc.nextLine();
			longString str=new longString();
			try 
			{
				str.setinputString(name);
				System.out.println("Success !your string is:"+str.getinputString());
			}
			catch(ExceptionLineTooLong e) 
			{
				e.setinvaliString("STRING IS TOO LONG--");
				System.out.println("EXCEPTION:"+e.getinvalidString());
			}
		}
}
