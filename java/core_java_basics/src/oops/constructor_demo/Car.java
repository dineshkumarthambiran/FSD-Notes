package oops.constructor_demo;

public class Car {
	//Instance variables
	private int plateNo;
	private String color;
	private String engineType;
	
	//Default constructor
	Car(){
		plateNo = 768;
		color = "White";
		engineType = "A8";
	}
	//Parameterized constructor
	Car(int plateNo, String color){
		this.plateNo = plateNo;
		this.color = color;
	}
	
	Car(int plateNo, String color, String engineType){
		this.plateNo = plateNo;
		this.color = color;
		this.engineType = engineType;
	}
	
	public int getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(int plateNo) {
		this.plateNo = plateNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	
	public void displayCarDetails() {
		System.out.println("PlateNo: "+plateNo);
		System.out.println("Engine Type: "+engineType);
		System.out.println("Color: "+color);
	}
}
