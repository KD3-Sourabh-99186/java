import java.util.Scanner;
class Restraunt {
	   static int menu() {
		   Scanner scn=new Scanner(System.in);
		   int choice;
		   System.out.println("Enter choice : ");
		   System.out.println("1.Dosa ");
		   System.out.println("2.Samosa ");
		   System.out.println("3.idli ");
		   System.out.println("4.paratha ");
		   System.out.println("5.poha ");
		   System.out.println("6.jalebi ");
		   System.out.println("7.vada pav ");
		   System.out.println("8.chai ");
		   System.out.println("9.coffe ");
		   System.out.println("10.Generate bill ");
		   choice=scn.nextInt();
		   scn.nextLine();
		   if(choice<0 || choice>10) {
			   System.out.println("Enter valid number");
			   return menu();
		   }
		   return choice;
	   }
}
public class Assign1_3 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int choice;
	   int bill=0;
	   while((choice=Restraunt.menu())!=10) {
		   System.out.println("Enter Quantity : ");
		   int Q=sc.nextInt();
		   switch(choice) {
		      case 1: {
		    	  bill=bill+150*Q;
		    	  break;
		      }
              case 2: {
            	  bill+=(15*Q);
		    	  break;
		      }
              case 3: {
            	  bill+=(70*Q);
		    	  break;
		      }
              case 4: {
            	  bill+=(40*Q);
		    	  break;
		      }
              case 5: {
            	  bill+=(20*Q);
		    	  break;
		      }
              case 6: {
            	  bill+=(30*Q);
		    	  break;
		      }
              case 7: {
            	  bill+=(20*Q);
		    	  break;
		      }
              case 8: {
            	  bill+=(10*Q);
		    	  break;
		      }
              case 9: {
            	  bill+=(20*Q);
		    	  break;
		      }
              default :{
            	  System.out.println("Enter valid number");
            	  break;
              }
		   
		   }
		   
	   }
	   System.out.println("Total amount is : "+bill);
   }
}
