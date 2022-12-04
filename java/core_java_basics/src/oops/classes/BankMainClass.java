package oops.classes;

public class BankMainClass {
	public static void main(String[] args) {
		BankCustomer ananth = new BankCustomer();
//		ananth.displayDetails();
		
		ananth.setAccNo(2000);
		ananth.setAccName("Ananth Yadav");
		ananth.setLocation("Mumbai");
		
		//Can't access the private variable directly
//		System.out.println("Account Number : "+ananth.accNo);
		//Hence we use the getter method to display the details
		System.out.println("Account Number : "+ananth.getAccNo());
		System.out.println("Account Name: "+ananth.getAccName());
		System.out.println("Location: "+ananth.getLocation());

//		ananth.displayDetails();
	}
}
