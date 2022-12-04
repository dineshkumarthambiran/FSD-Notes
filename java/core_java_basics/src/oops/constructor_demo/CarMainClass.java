package oops.constructor_demo;

public class CarMainClass {
	public static void main(String[] args) {
		Car dineshCar = new Car();
		Car rajaCar = new Car(1, "Black", "V8");
		Car arvinthCar = new Car(123, "Red");
		
//		dineshCar.setPlateNo(8055);
//		dineshCar.setEngineType("v8");
//		dineshCar.setColor("Black");
		
//		rajaCar.setPlateNo(1);
//		rajaCar.setEngineType("v8");
//		rajaCar.setColor("White");
		
		rajaCar.setColor("Red");
		
		dineshCar.displayCarDetails();
		rajaCar.displayCarDetails();
	}
}
