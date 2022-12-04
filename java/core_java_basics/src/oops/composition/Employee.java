package oops.composition;

public class Employee {
	Address address;
	Department department;

	public Employee(Address address, Department department) {
		this.address = address;
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
