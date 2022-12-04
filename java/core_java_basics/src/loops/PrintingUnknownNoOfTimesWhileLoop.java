package loops;

import java.util.Scanner;

public class PrintingUnknownNoOfTimesWhileLoop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input a number");
		int num = s.nextInt();
		
		while(num>0) {
			int i = num%10;
			System.out.print(i);
			num= num/10;
		}
	}
}
