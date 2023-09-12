package PracticeQuestion;
import java.util.*;
public class reverseString {
	 public static void main(String[] args) {
	        int num=121;
	      int  originalNum=num;
	      int remainder;
	      int result=0;
	      while(num!=0){
	          remainder=originalNum%10;
	          result+=Math.pow(remainder,3);
	          originalNum/=10;
	      }
	      if(result==num){
	          System.out.println("Number is armstrong");
	      }
	      else{
	           System.out.println("Number is not  armstrong");
	      }
	    }
}
