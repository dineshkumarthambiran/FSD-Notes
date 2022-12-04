package sorting_collections.comparator.withlambda;

public class Customer {
	private Integer custAcNo;
	private String custName;
	private Double balance;
	public Customer(Integer custAcNo, String custName, Double balance) {
		super();
		this.custAcNo = custAcNo;
		this.custName = custName;
		this.balance = balance;
	}
	public Integer getCustAcNo() {
		return custAcNo;
	}
	public void setCustAcNo(Integer custAcNo) {
		this.custAcNo = custAcNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [custAcNo=" + custAcNo + ", custName=" + custName + ", balance=" + balance + "]";
	}
}
