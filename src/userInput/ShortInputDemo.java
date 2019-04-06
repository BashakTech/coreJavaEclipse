package userInput;

import java.util.Scanner;

public class ShortInputDemo {
	public static void main(String[] args) {
		
		short st1, st2;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter your 1st short value and press enter: ");
		st1 = obj.nextShort();
		
		System.out.print("Enter your 2nd short value and press enter too: ");
		st2 = obj.nextShort();
		
		System.out.println("\nYour 1st short value is: " +st1);
		System.out.println("Your 2nd short value is: " +st2);
	}

}
