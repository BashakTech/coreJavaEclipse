package userInput;

import java.util.Scanner;

public class DoubleInputDemo {
	
	public static void main(String[] args) {
		
		double d1, d2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("input 1st double value: ");
		d1 = scanner.nextDouble();
		
		System.out.print("input 2nd double value: ");
		d2 = scanner.nextDouble();
		
		System.out.println("double d1 = " +d1);
		System.out.println("double d2 = " +d2);
		
		System.out.println("d1 + d2 = " +(d1+d2));
	}

}
