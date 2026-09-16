package Assign2_3;

public class DateTest {
   public static void main(String[] args) {
	   Date d1=new Date(12,2,2003);
	   d1.displayDate();
	   System.out.println("d1 month is : "+d1.getMonth());
	   System.out.println("d1 day is : "+d1.getDay());
	   System.out.println("d1 year is : "+d1.getYear());
	   
	   d1.setDay(5);
	   d1.setMonth(2);
	   d1.setYear(1982);
	   
	   System.out.println("d1 month is : "+d1.getMonth());
	   System.out.println("d1 day is : "+d1.getDay());
	   System.out.println("d1 year is : "+d1.getYear());
	   
	   d1.displayDate();
   }
}
