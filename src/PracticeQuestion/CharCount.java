package PracticeQuestion;
import java.util.HashMap;
public class CharCount {

	 public static void main(String[] args) {
	     String str="nidhi";
	    HashMap<Character,Integer> charCount=new HashMap<>();
	     for(int i=0;i<str.length();i++){
	         char charAtPosition=str.charAt(i);
	         if(charCount.containsKey(charAtPosition)){
	             int count=charCount.get(charAtPosition);
	             charCount.put(charAtPosition,++count);
	         }
	         else{
	             charCount.put(charAtPosition,1);
	         }
	     }
	     System.out.println(charCount);
	    }
}
