package PracticeQuestion;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class PrintUnique {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string: ");
String str=sc.nextLine();

Set<Character> printUnique=new HashSet<>();

for(int i=0;i<str.length();i++) {
	char charAtPosition=str.charAt(i);
	printUnique.add(charAtPosition);
}
for(Character letter:printUnique) {
	System.out.println(letter);
}

	}

}
