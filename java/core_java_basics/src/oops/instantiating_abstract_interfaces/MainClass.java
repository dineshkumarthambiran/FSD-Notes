package oops.instantiating_abstract_interfaces;

public class MainClass {
	public static void main(String[] args) {
		Animal lion = new Lion(); //Instantiation or object creation
		
		lion.eat();
		lion.sleep();
		lion.die();
		
		Animal cat = new Cat();
		cat.eat();
		cat.sleep();
		cat.die();
		
		Animal elephant = new Animal() {

			@Override
			public void eat() {
				System.out.println("Elephant is eating");
			}

			@Override
			public void sleep() {
				System.out.println("Elephant is sleep");
			}
		};
		
		Animal zebra = new Animal() {

			@Override
			public void eat() {
				System.out.println("Zebra has eaten");
			}

			@Override
			public void sleep() {
				System.out.println("Zebra is sleeping");
			}
			
		};
		
		Animal lion2 = new Lion() {
			@Override
			public void eat() {
				System.out.println("Big Lion is eating...");
			}
		};
		
		elephant.eat();
		elephant.sleep();
		elephant.die();
		
		zebra.eat();
		zebra.sleep();
		zebra.die();
	}
}
