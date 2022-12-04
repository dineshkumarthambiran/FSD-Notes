package oops.polymorphism.static_pm;

import java.util.Scanner;

public class Shape {
	Scanner s = new Scanner(System.in);
	//To find the area of circle
	
	//To find the area of Triangle
	public void area(double b, double h) {
		double result = 0.5 * b * h;
		System.out.println("Area of Triangle: "+result);
	}
	
	public void area() {
		
		float pi = 3.14f;
		System.out.println("Input radius: ");
		float radius = s.nextFloat();
		float result = pi * radius * radius;
		System.out.println("Area of circle: "+result);
	}
	
	//To find the area of rectangle
	public void area(float len, float bre) {
		float  result = len * bre;
		System.out.println("Area of Rectangle: "+result);
	}
	
	//To find the area of square
	public void area(float s) {
		float result = s*s;
		System.out.println("Are of square: "+result);
	}
	
	
}
