package PracticeQuestion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorialnum(10));

	}
	public static long factorialnum(long num) {
		if(num==1) {
			return 1;
		}
		else {
			return (num *(factorialnum(num-1)));
		}
		
	}

}
