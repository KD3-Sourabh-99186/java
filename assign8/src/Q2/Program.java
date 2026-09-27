package Q2;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Program {
  public static List<String> getColours(){
	  List<String> colours = new ArrayList<>();
	  Collections.addAll(colours,"blue", "green", "red", "yellow", "green");
	  return colours;  
  }
  public static void main(String[] args) {
	  List<String> colours = new ArrayList<>();
	  colours=Program.getColours();
	  Collections.sort(colours);
	  for(String s : colours)
		  System.out.println(s);
  }
}
