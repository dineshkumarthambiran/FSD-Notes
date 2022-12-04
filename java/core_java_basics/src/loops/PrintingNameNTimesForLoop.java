package loops;

import java.util.Scanner;

public class PrintingNameNTimesForLoop {
	public static void main(String[] args) {
		String name;
		int numOfTimes;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input your name: ");
		name = s.next();
		
		System.out.println("Input number of times to be printed: ");
		numOfTimes = s.nextInt();
		
//		for(int x=0; x<numOfTimes; x++) {
//			System.out.println(x+"-"+name);
//		}
		
//		for(int x=1; x<=numOfTimes; x++) {
//			System.out.println(x+"-"+name);
//		}
		
		for(int x=numOfTimes; x>0; x++) {
			
			System.out.println(x+"-"+name);
			if(x==100) {
				break;
			}
		}
	}
}
