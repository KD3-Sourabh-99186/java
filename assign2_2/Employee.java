package assign2_2;

public class Employee {
   String firstName;
   String lastName;
   double monthlySalary;
   
   Employee(){
	   
   }
   Employee(String firstName, String lastName, double monthlySalary){
	   this.firstName=firstName;
	   this.lastName=lastName;
	   if(monthlySalary>=0) {
		  this.monthlySalary=monthlySalary;   
	   }
   }
   //getter and setters
   String getFirstName() {
	return firstName;
   }
   void setFirstName(String firstName) {
	this.firstName = firstName;
   }
   String getLastName() {
	return lastName;
   }
   void setLastName(String lastName) {
	this.lastName = lastName;
   }
   double getMonthlySalary() {
	return monthlySalary;
   }
   void setMonthlySalary(double monthlySalary) {
	if(monthlySalary>=0) {
	   this.monthlySalary=monthlySalary;   	   }
    }
   void giveHike() {
	   this.monthlySalary=this.monthlySalary*1.1;
   }
   
}
