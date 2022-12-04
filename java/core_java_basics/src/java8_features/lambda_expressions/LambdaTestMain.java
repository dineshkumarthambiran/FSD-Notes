package java8_features.lambda_expressions;

import java8_features.functional_interface_intro.FunctionalInterfaceExample2;

public class LambdaTestMain {
	public static void main(String[] args) {
		
		MyFunctioanlInterface object2 = new MyFunctioanlInterface() {
			@Override
			public void printMessage(String message) {
				System.out.println(message);				
			}
		};
		
		MyFunctioanlInterface obj1 =  message -> System.out.println(message);
	
		MyFunctionalInterface2 obj2 = message -> message.length();
		
//		MyFunctionalInterface2 obj3 = new MyFunctionalInterface2() {
//			@Override
//			public int getMessageLength(String message){
//				return message.length();
//			}
//		};
		
		obj1.printMessage("Welcome to Coding...");
		System.out.println(obj2.getMessageLength("Happy Holidays..."));
	}
}
