package PracticeQuestion;

public class swapping {

	public static void main(String[] args) {

		int x=25;
		int y=23;
		System.out.println("before swapping " + x + " " +y);
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swapping " + x + " " +y);
	}

}
