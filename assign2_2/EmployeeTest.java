package assign2_2;

public class EmployeeTest {
  public static void main(String[] args) {
	  Employee e1=new Employee("Sourabh","Patel",10000);
	  Employee e2=new Employee("anuj","agrawal",15000);
	  System.out.println("Yearly salary of Sourabh is : "+e1.getMonthlySalary()*12);
	  System.out.println("Yearly salary of anuj is : "+e2.getMonthlySalary()*12);
      System.out.println("10% hike given to sourabh and anuj");
      e1.giveHike();
      e2.giveHike();
      System.out.println("Yearly salary of Sourabh is : "+e2.getMonthlySalary()*12);
	  System.out.println("Yearly salary of anuj is : "+e1.getMonthlySalary()*12);
  }
}
