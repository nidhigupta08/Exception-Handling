package exceptionHandling;

public class ReturnTryCatchFinally {
	
	 int m1() // Compile time error.
	 { 
	   try {
	      System.out.println("I am in try block");
	      int x=5/0;
	      return 50;
	   }
	   catch(ArithmeticException e)
   {
     System.out.println("I am in catch block");
    return 50;
   }
	   
	   	finally {
	   		System.out.println("I m in finally block");
	   		return 100;
	   	}
	//   System.out.println("statement after return ");  unreachable code
	 }
	public static void main(String[] args) {
		ReturnTryCatchFinally ft = new ReturnTryCatchFinally();
		   System.out.println(ft.m1());
		  }

	}

//In the above example program, finally block overrides the value returned by catch block. Therefore, the returned value is 100.

