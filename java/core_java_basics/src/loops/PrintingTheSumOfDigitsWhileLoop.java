package loops;

import java.util.Scanner;

public class PrintingTheSumOfDigitsWhileLoop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input a number");
		int num = s.nextInt();
		int sum = 0;
		while(num>0) {
			int i = num%10;
//			System.out.print(i);
			sum+=i;
			num= num/10;
		}
		System.out.println(sum);
	}
}
