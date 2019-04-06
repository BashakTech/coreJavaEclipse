package operatorDemo.simpleMath;

import java.util.Scanner;

public class CircleDemo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double radius, area;
		
		System.out.print("Enter radius:");
		radius = scan.nextDouble();
		
		area = 3.1416 * radius * radius;
		
		System.out.println("Area of Circle: " +area);
	}

}
