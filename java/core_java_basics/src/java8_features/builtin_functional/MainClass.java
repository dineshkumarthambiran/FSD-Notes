package java8_features.builtin_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MainClass {
	public static void main(String[] args) {
//		Predicate helps checking a condition and returns a boolean result
		
//		Predicate<String> predicate = new Predicate<String>() {
//			@Override
//			public boolean test(String name) {
//				return name.length() > 5;
//			}
//		};
		
		Predicate<String> checkIdNameIsMoreThan5 = name -> name.length() > 5;
		System.out.println(checkIdNameIsMoreThan5.test("Vignesh"));
		
//		Function is a generic functional interface that has apply methid in it
//		The E apply(T t) accepts any type of arguments and returns any type of value
	
		Function<String, Integer> returnsTheStrLength = 
				(message) -> message.length();
		System.out.println("Message length: "+returnsTheStrLength.apply("Hello all..."));
	}
}
