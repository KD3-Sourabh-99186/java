package Q1;

interface Stack{
	public int STACK_SIZE = 2;
	public boolean push(Employee e);
	public Employee pop();
	public boolean status();
}

class GrowableStack implements Stack{
	public Employee[] stack = new Employee[STACK_SIZE];
	public int TOP=-1;

	@Override
	public boolean push(Employee e) {
		if(TOP < stack.length-1) {
			stack[++TOP] = e;
			return true;
		}
		else {
			//we created copy of existing stack
			Employee[] temp = stack;
			//we created new array of double  size which is using same previous refrence  
			stack = new Employee[temp.length*2];
			//copy data of temp in new stack
			for(int i=0; i<temp.length; i++) {
				stack[i]=temp[i];
			}
			//here we pushed our data in stack
			//here we first increament TOP then pushed data
			stack[++TOP]=e;
			return true;
		}
		
	}

	@Override
	public Employee pop() {
		//here we checked condition that TOP is greater than or equals to 0
		if(TOP>=0) {
			return stack[TOP--];
		}
		//if condition fails
		return null;
	}

	@Override
	public boolean status() {
		return true;
	}
	
	
} 

class FixedStack implements Stack{
    public Employee[] stack = new Employee[STACK_SIZE];
    int TOP=-1;
    
	@Override
	public boolean push(Employee e) {
		if(TOP < stack.length-1) {
			stack[++TOP]=e;
			return true;
		}
		else {
			return false;
		}	
	}

	@Override
	public Employee pop() {
		if(TOP>0) {
			return stack[TOP--];
		}
		return null;
	}

	@Override
	public boolean status() {
		if(TOP>=(stack.length-1))
			return false;
		return true;
	}
	
}
public class Stacks {

}
