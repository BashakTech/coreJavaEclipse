package controlStatement;

import java.util.Scanner;

public class PositiveDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("Enter any integer: ");
		num = scan.nextInt();
		
		if (num > 0) {
			System.out.println("The number is positive.");
		}
		else if (num < 0){
			System.out.println("The number is negative.");
		}
		else {
			System.out.println("The number is zero.");
		}
	}

}
