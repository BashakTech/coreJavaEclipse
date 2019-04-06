package userInput;

import java.util.Scanner;

public class StringInputDemo {
	public static void main(String[] args) {
		
		String str;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter ant type of String value: ");
		str = scan.nextLine();
		
		System.out.println(str);
	}

}
