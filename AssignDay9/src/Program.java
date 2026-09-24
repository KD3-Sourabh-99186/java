import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Comparator;

//used for case 5
class SortByPrice implements Comparator<Book>{

	@Override
	public int compare(Book x, Book y) {
		Double res =x.getPrice()-y.getPrice();
		return res.intValue();
	}
	
}
public class Program {
   static Scanner sc=new Scanner(System.in);
   
   
   public static int menu() {
	   System.out.println("0.exit");
	   System.out.println("1.Add new book in list");
	   System.out.println("2.Display all books in forward order");
	   System.out.println("3.Display all books in reverse order");
	   System.out.println("4.delete a book at given index");
	   System.out.println("5.Sort all books by price in desc order");
	   System.out.println("enter choice");
	   int choice;
	   choice=sc.nextInt();
	   return choice;
	   
   }
   
   //used for case 1
   public static void acceptRecord(Book b) {
	   System.out.print("enter ISBN number : ");
	   sc.nextLine();
	   b.isbn=sc.nextLine();
	   System.out.print("enter price : ");
	   b.price=sc.nextDouble();
	   System.out.print("enter authorName : ");
	   sc.nextLine();
	   b.authorName=sc.nextLine();
	   System.out.print("enter quantity : ");
	   b.quantity=sc.nextInt();
	   System.out.println();
   }
   
   public static void main(String[] args) {
	   int choice;
	   List<Book> library= new ArrayList<>();
	   while((choice=menu())!=0) {
		   switch(choice) {
		   case 1:{
			   Book b=new Book();
			   acceptRecord(b);
			   library.add(b);
			   break;
		   }
		   case 2:{
			   ListIterator<Book> iterator=library.listIterator();
			   while(iterator.hasNext()) {
				   Book b=iterator.next();
				   System.out.println(b);
			   }
			   break;
		   }
		   case 3:{
			   ListIterator<Book> iterator=library.listIterator(library.size());
			   while(iterator.hasPrevious()) {
				   Book b=iterator.previous();
				   System.out.println(b);
			   }
			   break;
		   }
		   case 4:{
			   int index;
			   System.out.print("enter index : ");
			   index=sc.nextInt();
			   library.remove(index);
			   break;
		   }
		   case 5:{
			   library.sort(new SortByPrice());
			   ListIterator<Book> iterator=library.listIterator();
			   while(iterator.hasNext()) {
				   Book b=iterator.next();
				   System.out.println(b);
			   }
			   break;
		   }
		   }
	   }
   }
}
