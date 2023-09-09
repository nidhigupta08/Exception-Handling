package PracticeQuestion;

public class Palindrome {
public static void main(String[] args) {
	int num=121;
	 int originalNum=num;
	 int rev=0;
	 
	 while(num!=0) {
		 rev=rev*10 +num%10;
		 num/=10;
	 }
	 
	 if(originalNum==rev) {
		 System.out.println("Given number is palindrome");
	 }
	 else {
		 System.out.println("GIven numner is not palindrome");
	 }
}

}
