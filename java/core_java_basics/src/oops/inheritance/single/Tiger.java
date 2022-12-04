package oops.inheritance.single;

import abstract_classes.Animal;

public class Tiger extends Animal{

	@Override
	public void eat() {
		System.out.println("Tiger loves meat...");
		System.out.println("Eats more than 15 kgs of meat a day");
	}

	@Override
	public void sleep() {
		System.out.println("Sleeps 12 hours a day");
	}

	@Override
	public void run() {
		System.out.println("Runs at 50km/h");
	}

}
