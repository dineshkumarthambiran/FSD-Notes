package loops;

import java.util.Scanner;

public class AtLeastOnceDoWhile {
	public static void main(String[] args) {
		int num;
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your name: ");
		name = scan.next();
		System.out.println("Input no of times to be printed:");
		num = scan.nextInt();
		
		int i =0;
		do {
			System.out.println(i+" - "+name);
			i++;
		}while(i<num);
	
	}
}
