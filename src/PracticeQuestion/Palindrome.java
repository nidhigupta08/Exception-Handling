package PracticeQuestion;

public class Palindrome {
	public static void main(String [] args) {
int num=121;
int originalNum=num;
int rev=0;
while(num!=0) {
	rev=rev *10 + num%10;
	num/=10;
}
System.out.println("Reverse number is " +rev);
if(originalNum==rev) {
	System.out.println("number is palindrome");
}
else {
	System.out.println("number is not palindrome");
}
	}

}
