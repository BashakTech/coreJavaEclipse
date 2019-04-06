package userInput;

import java.util.Scanner;

public class CharacterInputDemo {

	public static void main(String[] args) {
		
		char c1;
		Scanner abc = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		c1 = abc.next().charAt(0);
		
		System.out.println("c1 = " +c1);

	}

}
