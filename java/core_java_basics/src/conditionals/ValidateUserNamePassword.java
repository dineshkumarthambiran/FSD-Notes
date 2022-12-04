package conditionals;

import java.util.Scanner;

public class ValidateUserNamePassword {
	public static void main(String[] args) {
		String userName, password;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your username and password:");
		
		userName = scan.next();
		password = scan.next();

//		The below code won't work
//		if(userName=="Raja" && password == "1234") {
//		The correct code
		if(userName.equals("Raja") && password.equals("1234")) {

			System.out.println("Welcome Raja");
		}
		else {
			System.out.println("Invalid credentials");
		}
	}
}
