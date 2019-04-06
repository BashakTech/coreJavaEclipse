package controlStatement;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch;
		
		System.out.print("Enter a character: ");
		ch = scan.next().charAt(0);
		
		if (ch == 'a') {
			System.out.println("Vowel");
		}
		else if (ch == 'e') {
			System.out.println("Vowel");
		}
		else if (ch == 'i') {
			System.out.println("Vowel");
		}
		else if (ch == 'o') {
			System.out.println("Vowel");
		}
		else if (ch == 'u') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
		
		
	}
}
