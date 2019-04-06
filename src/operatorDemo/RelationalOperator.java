/*	
	 * Relational Operator are: 
	 * 		> , >= , < , <= ,== , != 
	 * Output only Boolean Value
	 * */
package operatorDemo;

public class RelationalOperator {
	public static void main(String[] args) {
		
		int a, b;
		a = 15;
		b = 16;
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		
		System.out.println();
		
		System.out.println("a >  b = " + (a>b));
		System.out.println("a >= b = " + (a>=b));
		
		System.out.println();
		
		System.out.println("a <  b = " + (a<b));
		System.out.println("a <= b = " + (a<=b));
		
		System.out.println();
		
		System.out.println("a == b " + (a==b));
		System.out.println("a != b " + (a!=b));
		
		System.out.println();
		
		System.out.println("a = b  = " + (a=b));
	}

}
