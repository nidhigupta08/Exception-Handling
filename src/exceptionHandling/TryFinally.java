package exceptionHandling;

public class TryFinally {

	public static void main(String[] args) {
	// normal try-catch and finally 	
		// System.out.println (m1 ());
		int a=10;
		int b=5;
		int c=5;
		 int result;
		 
		 try {
			 result=a/(b-c);
			 System.out.println(result);
		 }
		 catch(ArithmeticException am) {
			 System.out.println(am);
		 }
		 finally {
			 System.out.println("I m in finally block");
		 }  
		 
// another example
	try 
	{ 
	  System.out.println("111"); 
	  System.out.println(20/0); 
	  System.out.println("222"); 
	 } 
	catch(Exception ae) 
	{ 
	  System.out.println(10/0); 
	} 
	finally 
	{ 
	  System.out.println("444"); 
	 } 
	System.out.println("555"); 
	 } 
//	  static int m1 ()
//	  {
//	    try
//	    {
//	      System.out.println ("in try");
//	      return 10;
//	    }
//	    catch (ArithmeticException ae)
//	    {
//	      System.out.println ("in catch");
//	      return 20;
//	    }
//	    finally
//	    {
//	      System.out.println ("in finally");
//	      return 30;
//	    }
//	   // System.out.println ("after try catch finally"); //unreachable statement
//	  }
}
