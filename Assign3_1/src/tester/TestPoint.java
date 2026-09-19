package tester;
import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {
  public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     Point2D p1=new Point2D();
     Point2D p2=new Point2D();
     System.out.println("Enter coordinates of p1");
     p1.x=sc.nextInt();
     p1.y=sc.nextInt();
     System.out.println("Enter coordinates of p2");
     p2.x=sc.nextInt();
     p2.y=sc.nextInt();
     System.out.println(p1.getDetails());
     if(p1.isEqual(p2)) {
    	 System.out.println("Boht points are same location");
     }
     else {
    	 System.out.println("distance between two points is "+p1.calculateDistance(p2));
     }
  }
}