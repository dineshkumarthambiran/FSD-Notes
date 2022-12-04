package conditionals;

import java.util.Scanner;

public class CheckingVowelsUsingSwitchCase {
	public static void main(String[] args) {
		char alpha;
		Scanner s = new Scanner(System.in);
		System.out.println("Input an alphabet:");
		alpha = s.next().charAt(0);
		
		switch(alpha) {
			case 'a':
				System.out.println("Vowel");
				break;
			case 'e':
				System.out.println("Vowel");
				break;
			case 'i':
				System.out.println("Vowel");
				break;
			case 'o':
				System.out.println("Vowel");
				break;
			case 'u':
				System.out.println("Vowel");
				break;
			default:
				System.out.println("Consonant");
		}
	}
}
