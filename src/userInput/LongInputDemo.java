package userInput;

import java.util.Scanner;

public class LongInputDemo {

	public static void main(String[] args) {
		
		Scanner abc = new Scanner(System.in);
		
		long l1, l2;
		
		System.out.print("Enter your 1st long Value: ");
		l1 = abc.nextLong();
		System.out.print("Enter your 2nd long Value: ");
		l2 = abc.nextLong();
		
		System.out.println("Your entered 1st value is: " +l1);
		System.out.println("Your entered 2nd value is: " +l2);

	}

}
