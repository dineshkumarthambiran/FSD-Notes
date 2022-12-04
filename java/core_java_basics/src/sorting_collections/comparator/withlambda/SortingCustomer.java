package sorting_collections.comparator.withlambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCustomer {
	public static void main(String[] args) {
		List<Customer> list = Arrays.asList(
				new Customer(100, "Makesh", 100000.0),
				new Customer(99, "Arun", 1000000.0),
				new Customer(98, "Rajesh", 10000.0),
				new Customer(102, "Priya", 100.0),
				new Customer(107, "Akash", 10000.0)
				);
		
		Collections.sort(list, (o1, o2)-> o1.getCustAcNo() - o2.getCustAcNo());
		
		System.out.println("Sorting by Customer Account Number: \n");
		for(Customer c: list) {
			System.out.println(c);
		}
		
		Collections.sort(list, (o1, o2)-> o1.getCustName().compareTo(o2.getCustName()));
		
		System.out.println("Sorting by Customer Name: \n");
		for(Customer c: list) {
			System.out.println(c);
		}
		
		Collections.sort(list, (o1, o2) -> o2.getBalance().compareTo(o1.getBalance()));
		
		System.out.println("Sorting by Customer by Acc Balance: \n");
		for(Customer c: list) {
			System.out.println(c);
		}
	}
}
