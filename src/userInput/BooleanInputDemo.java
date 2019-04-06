package userInput;

import java.util.Scanner;

public class BooleanInputDemo {
	public static void main(String[] args) {
		
		boolean bl1;
		boolean bl2;
		
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("You can enter boolean value only true or false...");
		
		System.out.print("Enter 1st boolean value: ");
		bl1 = xyz.nextBoolean();
//		System.out.print("Enter 2nd boolean value: ");
//		bl2 = xyz.nextBoolean();
		
		System.out.println("Your boolean value is: " +bl1);
		System.out.println("You are success...");
	}

}
