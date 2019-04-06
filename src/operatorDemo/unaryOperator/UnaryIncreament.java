package operatorDemo.unaryOperator;

public class UnaryIncreament {
	public static void main(String[] args) {
		
		int x, y;
		int a, b, c;
		
		x = 10;
		y = 15;
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println();
		
		a = ++x;
		b = y++;
		
		c = b;
		
		System.out.println("a = ++x  = " +a);
		System.out.println("b = y++  = " +b);
		System.out.println("c = b    = " +c);
		
		System.out.println();
		
		System.out.println("x= " +x);
		System.out.println("y= " +y);
	}

}
