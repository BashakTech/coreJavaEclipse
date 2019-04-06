package userInput;

import java.util.Scanner;

public class ByteInputDemo {

	public static void main(String[] args) {
		
		byte bt1;
		Scanner scanning = new Scanner(System.in);
		
		System.out.println("Enter your byte value -128 - 127");
		bt1 = scanning.nextByte();
		
		System.out.println("Your entered byte value is: " +bt1);

	}

}
