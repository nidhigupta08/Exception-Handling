package exceptionHandling;
import java.io.IOException;

public class Throws {

	static void display() throws IOException
	{
	   System.out.println("Hello Java");
	   throw new IOException();
	 }
	
	public static void main(String[] args) {
	Throws obj = new Throws();
	 try {
	   obj.display();
	} 
	catch (IOException e) {
	 System.out.println("Caught an exception: \n" +e);	 
	  }
	 }
}


