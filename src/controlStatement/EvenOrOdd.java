package controlStatement;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("Enter Positive integer: ");
		num = input.nextInt();
		
		if (num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

}
