package PracticeQuestion;

public class Snippet {
//	 public static void main(String[] args) {
//	        int num=121;
//	      int  originalNum=num;
//	      int remainder;
//	      int result=0;
//	      while(num!=0){
//	          remainder=num%10;
//	          result+=Math.pow(remainder,3);
//	          originalNum/=10;
//	      }
//	      if(originalNum==result){
//	          System.out.println("Number is armstrong");
//	      }
//	      else{
//	           System.out.println("Number is not  armstrong");
//	      }
//	    }
	 public static void main(String[] args) {
	      int num=371;
	     int remainder;
	     int result=0;
	     int originalNum=num;
	    while(originalNum!=0){
	        remainder=originalNum %10;
	        result+=Math.pow(remainder,3);
	        originalNum/=10;
	    }
	    if(result==num){
	        System.out.println("Given number is armstrong number");
	    }
	    else{
	         System.out.println("Given number is not armstrong number");
	    }
	        
	    }
}

