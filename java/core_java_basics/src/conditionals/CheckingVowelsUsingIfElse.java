package conditionals;

import java.util.Scanner;

public class CheckingVowelsUsingIfElse {
	public static void main(String[] args) {
		char alpha;
		Scanner s = new Scanner(System.in);
		System.out.println("Input an alphabet:");
		alpha = s.next().charAt(0);
		
		if(alpha=='a') {
			System.out.println("Vowel");
		}
		else if(alpha=='e') {
			System.out.println("Vowel");
		}
		else if(alpha=='i') {
			System.out.println("Vowel");
		}
		else if(alpha=='o') {
			System.out.println("Vowel");
		}
		else if(alpha=='u') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}
}
