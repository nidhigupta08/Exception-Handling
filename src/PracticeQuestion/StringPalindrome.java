package PracticeQuestion;

public class StringPalindrome {
		
	public static void main(String[] args) {
		String original="madam";
		String reverse="";
		int stringlength=original.length();
		for(int i=stringlength-1;i>=0;i--) {
			reverse+=original.charAt(i);
		}
			if(original.equals(reverse)) {
				System.out.println("Given number is palindrome");
			}
			else {
				System.out.println("Given number is not palindrome");
			}
			}

	
}