package formatSpecifier;

public class IntegerSpecifierDemo {
	public static void main(String[] args) {
		
		int a = 45;
		int b = 120;
		
		System.out.printf("int a = %d\n", a);
		System.out.printf("int a = %d\n", b);
		System.out.printf("int a = %d\n", +(200-(a+b)));
	}

}
