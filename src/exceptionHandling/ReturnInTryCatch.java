package exceptionHandling;
// Case 8: Return statement in catch block but exception occurred in try block.
public class ReturnInTryCatch {
	
	int method1() {
		try {
			System.out.println("I m in try block");
//Case 4: Return statement in try block and at end of method but exception occurred in try block.
			int x=10/0;
			  System.out.println("Result: " +x);
			//return 30;
		}
		catch(Exception e) {
			System.out.println("I m in catch block.");
			return 30;
		}	
		 // Here, no return statement at the end of method.so compile time error
		return 20;
//		Case 3: Return statement in try block and end of method but statement after return.
		//System.out.println("statement after return");  //unreachable code .compile time error
	}
	public static void main(String[] args) {


	ReturnInTryCatch r=new ReturnInTryCatch();
	 System.out.println(r.method1());
	
	}
}
