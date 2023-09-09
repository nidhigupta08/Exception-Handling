package PracticeQuestion;

public class Vowelpresent {

	public static void main(String[] args) {
		System.out.println(StringContainsVowel("google"));

	}

	public static boolean StringContainsVowel(String str) {
		return str.matches(".*[aeiou].*");
	}
}
