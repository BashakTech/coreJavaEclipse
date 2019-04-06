package userInput;

import java.util.Scanner;

public class IntegerInputDemo {
	public static void main(String[] args) {
		
		int x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your 1st int number: ");
		x = sc.nextInt();
		System.out.print("Enter your 2nd int numkber: ");
		y = sc.nextInt();
		
		System.out.println("Your 1st entered int number is: " +x);
		System.out.println("Your 2nd entered int number is: " +y);
		
	}

}
