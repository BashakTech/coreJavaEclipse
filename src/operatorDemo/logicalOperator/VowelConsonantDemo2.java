package operatorDemo.logicalOperator;

import java.util.Scanner;

public class VowelConsonantDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch;
		
		System.out.print("Enter a character: ");
		ch = scan.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("VOWEL");
		}
		else {
			System.out.println("Consonant");
		}
	}

}
