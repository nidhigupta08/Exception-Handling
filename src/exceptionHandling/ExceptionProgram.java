package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


class ListofNumbers{
  int [] arr=new int[10];
  public void writeList() {
	  try {
		  arr[10]=11;
	  }
	  catch(NumberFormatException nf) {
		  System.out.println(nf);
	  }
	  catch(ArrayIndexOutOfBoundsException aiobe) {
		  System.out.println(aiobe);
	  }
  }
}
public class ExceptionProgram {

	public static void main(String[] args) {
		ListofNumbers list=new ListofNumbers();
		list.writeList();
		
//int num=50/0; //may throw exception

try{
	int num=50/0; 
	
}
catch(Exception e){
	
	System.out.println( e );
}
System.out.println("rest of the code");
	    

	}

}

