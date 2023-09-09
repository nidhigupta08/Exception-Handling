package PracticeQuestion;

public class StringPalindrome {
		
	public static void main(String[]args) {
	String str="madam";
	String reverse="";
	
	int strLength=str.length();
	
	for( int i=strLength-1;1>=0;i--) {
		reverse+=str.charAt(i);
	}
//	if(str.equals(reverse)) {
//		System.out.println("palindrome");
//	}
//	else {
//		System.out.println("not palindrome");
//	}
	}
}
