package operators;

import java.util.Scanner;

public class OperatorsDemo {
	public static void main(String[] args) {
		int num = 100;		
		double mark1, mark2, mark3;
		Scanner scan = new Scanner(System.in);
		
//		System.out.println(++num);
//		System.out.println(num);
//		
//		num--;
//		
//		num*=2;
//		
//		System.out.println(num);
		
		System.out.println("Input mark 1, mark2 & mark3:");
		mark1 = scan.nextDouble();
		mark2 = scan.nextDouble();
		mark3 = scan.nextDouble();

		
//		Using the ternary operator

//		String result = (mark1>mark2)?"Mark1 is greater":"Mark2 is greater";
//		String result = (mark1>mark2)?"Mark1 is greater":(mark1==mark2)?"Mark1 and Mark2 are equal":"Mark2 is greater";
//		String result = 
//				(mark1>mark2)? ((mark1>mark3)?"Mark1 is the greatest":"Mark3 is the greatest"):
//			(mark2>mark3)?"Mark2 is the greatest":"Mark3 is the greatest";
		
//		System.out.println(result);
		
//		if(mark1>mark2) {
//			if(mark1>mark3) {
//				System.out.println("Mark1 is the greatest");
//			}
//			else  {
//				System.out.println("Mark3 is the greatest");
//			}
//		}
//		else {
//			if(mark2>mark3) {
//				System.out.println("Mark2 is the greatest");
//			}
//			else {
//				System.out.println("Mark3 is the greatest");
//			}
//		}
		
		if(mark1>mark2) {
			if(mark1>mark3) {
				System.out.println("Mark1 is the greatest");
			}
			else {
				if(mark2>mark3) {
					System.out.println("Mark2 is the greatest");
				}
				else {
					System.out.println("Mark3 is the greatest");
				}
			}
		}
	}
}
