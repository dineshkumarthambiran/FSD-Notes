package abstract_classes;

public class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("Cat always eat meat...");
	}

	@Override
	public void sleep() {
		System.out.println("Cat sleeps for many hours...");
	}

	@Override
	public void run() {
		System.out.println("Cats run faster");
	}

}
