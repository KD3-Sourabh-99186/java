package assign9;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class Program {
   static Scanner sc = new Scanner(System.in);
   
   //used for case 1
   public static Student acceptRecord(Student s) {
	   System.out.println("Enter rollno:");
	   s.setRollno(sc.nextInt());
	   sc.nextLine();
	   System.out.println("Enter name:");
	   s.setName(sc.nextLine());
	   System.out.println("Enter marks:");
	   s.setMarks(sc.nextDouble());
	   return s;
   }
   
   public static void Display(List<Student> c) {
	   Iterator<Student> itr = c.iterator();
	   while(itr.hasNext()) {
		   Student s = itr.next();
		   System.out.println(s);
	   }
   }
   
   //used for case 3
   public static Student search(List<Student> s , int rollno) {
	   for(Student st : s) {
		   if(st.getRollno()==rollno)
			   return st;
	   }
	   return null;
   }
   
   public static int menu() {
	   System.out.println("0.exit"); 
	   System.out.println("1.Add student"); 
	   System.out.println("2.Display all"); 
	   System.out.println("3.Search by rollno"); 
	   System.out.println("4.Sort by rollno"); 
	   System.out.println("5.Sort by name"); 
	   System.out.println("6.Sort by marks"); 
	   System.out.println("Enter choice");
	   return sc.nextInt();
   }
   
   public static void main(String[] args) {
	   List<Student> students = new ArrayList<>();
	   students.add(new Student(1, "Amit", 85.5));
       students.add(new Student(7, "Rahul", 78.0));
       students.add(new Student(3, "Priya", 92.5));
       students.add(new Student(2, "Sneha", 88.0));
       students.add(new Student(4, "Vikas", 76.5));
       students.add(new Student(6, "Neha", 95.0));
       students.add(new Student(5, "Rohan", 81.5));
       students.add(new Student(8, "Pooja", 89.0));
       students.add(new Student(9, "Karan", 72.5));
       students.add(new Student(10, "Anjali", 91.0));
       
       int choice;
       while((choice=menu())!=0) {
    	   switch(choice) {
    	   case 1:{
    		   Student s = new Student();
    		   s= acceptRecord(s);
    		   students.add(s);
    		   break;
    	   }
    	   case 2:{
    		   Display(students);
    		   break;
    	   }
    	   case 3:{
    		   System.out.println("Enter rollno");
    		   int rollno = sc.nextInt();
    		   Student s = search(students , rollno);
    		   System.out.println(s!=null ? s : "Student not found");
    		   break;
    	   }
    	   case 4:{
    		   Collections.sort(students, (x,y)->x.getRollno()-y.getRollno());
    		   Display(students);
    		   break;
    	   }
    	   case 5:{
    		   Collections.sort(students, (x,y)-> x.getName().compareTo(y.getName()));
    		   Display(students);
    		   break;
    	   }
    	   case 6:{
    		   Collections.sort(students, (x,y)-> Double.compare(x.getMarks(), y.getMarks()));
    		   Display(students);
    		   break;
    	   }
    	   }
       }
   }
}
