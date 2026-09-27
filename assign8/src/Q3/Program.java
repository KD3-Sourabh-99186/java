package Q3;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Program {
   public static void main(String[] args) {
	   List<Integer> list = new ArrayList<>();
	   Collections.addAll(list, 10,20,30,40,50,60,70,80,90);
	   list.remove(1);
	   list.add(1,100);
	   for(Integer i : list)
		   System.out.println(i);
   }
}
