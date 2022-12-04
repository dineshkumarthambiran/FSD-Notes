package oops.classes;

public class BankCustomer {
	private int accNo;
	private String accName;
	private String location;

	//Getter method ---> To access the properties from outside
	
		public int getAccNo(){
			return accNo;
		}
		
		public String getAccName() {
			return accName;
		}
	
		public String getLocation() {
			return location;
		}
		
	//Setter method
		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}
		
		public void setAccName(String accName) {
			this.accName = accName;
		}
		
		public void setLocation(String location) {
			this.location = location;
		}

	public void displayDetails() {
		System.out.println("Account Number: "+accNo);
		System.out.println("Account Name: "+accName);
		System.out.println("Location: "+location);
	}
}
