package userInput;

import java.util.Scanner;

public class FloatInputDemo {
	public static void main(String[] args) {
		
		
		float f1, f2, f3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first float Value: ");
		f1 = sc.nextFloat();
		System.out.print("Enter your second float Value: ");
		f2 = sc.nextFloat();
		
		f3 = f1+f2;
		
		System.out.println("Your 1st float Value is: " +f1);
		System.out.println("Your 2nd float Value is: " +f2);
		
		System.out.println("f3 = " +f3);
	}

}
