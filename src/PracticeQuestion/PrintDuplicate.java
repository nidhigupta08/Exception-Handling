package PracticeQuestion;

import java.util.HashSet;

public class PrintDuplicate {
	 public static void main(String[] args) {
	      String str="google";
	      int length=str.length();
	      String newStr="";
	      
	      HashSet<Character>printDuplicate=new HashSet<>();
	      
	      for(int i=0;i<length;i++){
	          char charAtPosition=str.charAt(i);
	          if(printDuplicate.contains(charAtPosition)){
	              newStr+=charAtPosition;
	          }
	          else{
	              printDuplicate.add(charAtPosition);
	          }
	      }
	      System.out.println(newStr);
	    }

}
  