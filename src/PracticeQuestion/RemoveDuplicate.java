package PracticeQuestion;
import java.util.Set;
import java.util.HashSet;
public class RemoveDuplicate {

	public static void main(String[] args) {
String str="google";
String newStr="";
int length=str.length();
Set<Character> removeDuplicate=new HashSet<>();

for(int i=0;i<length;i++) {
	char charAtPosition=str.charAt(i);
	if(!removeDuplicate.contains(charAtPosition)) {
		removeDuplicate.add(charAtPosition);
		newStr+= charAtPosition;
	}
}
System.out.println(newStr);

	}

}
