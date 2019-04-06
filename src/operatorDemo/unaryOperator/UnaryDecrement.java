package operatorDemo.unaryOperator;

public class UnaryDecrement {
	public static void main(String[] args) {
		
		int x, y;
		int a, b, c;
		
		x = 15;
		y = 25;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println();
		
		a = --x;
		b = y--;
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		
		System.out.println("x= " +x);
		System.out.println("y= " +y);
	}

}
