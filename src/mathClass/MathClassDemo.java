package mathClass;

public class MathClassDemo {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 3;
		
		int max = Math.max(x, y);
		System.out.println("Maximum = " +max);
		
		int min = Math.min(x, y);
		System.out.println("Maximum = " +min);
		
		int absolute = Math.abs(y);
		System.out.println("Absolute of y = " +absolute);
		
		double power = Math.pow(x, y);
		System.out.printf("x to the power of y = %.0f\n" ,power);
		
		int round = Math.round(8.6f);
		System.out.println("Round of 8.6 = " +round);
		
		double pi = Math.PI;
		System.out.println("pi = " +pi);

	}

}
