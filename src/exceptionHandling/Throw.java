package exceptionHandling;

public class Throw {
	
//	public void validate(int age) {
//		if(age<18) {
//			throw new ArithmeticException("person is not eligible to vote");
//		}
//		else {
//			System.out.println("person is eligible to vote");
//		}
//	}
	
	
//	The above code throw an unchecked exception. Similarly, we can also throw unchecked and user defined exceptions.
public static void main(String[] args) {
//	Throw a=new Throw();
//	a.validate(14);
	
	int num=1;
	for(num=1;num<=10;num++) {
		try {
			if(num==5) 
				throw new ArithmeticException("ArithmeticException");
			else if(num<2)
				throw new RuntimeException("RuntimeException"); 
		//	else if(num>9)
		//		throw new NullPointerException("NullPointerException");
		}
		catch(Exception e) {
			System.out.println("Exception caught:");
			System.out.println(e.getMessage());
		}
	}
}
}
