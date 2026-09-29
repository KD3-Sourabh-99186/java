package Q1;

public class ExceptionLineTooLong extends Exception {
	private String invalidString;
	
public ExceptionLineTooLong() {
	
}
public ExceptionLineTooLong(String invalidField) {
this.invalidString=invalidString;

}
public  void setinvaliString(String invalidString) {
	this.invalidString=invalidString;
}
public  String getinvalidString() {
	return  invalidString;
}

}
