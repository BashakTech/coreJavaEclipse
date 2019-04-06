package formatSpecifier;

public class FloatSpecifierDemo {
	public static void main(String[] args) {
		
		float f1 = 456.0009f;
		float f2 = 900.9999f;
		
		float f3 = 12.3245698f;
		float f4 = 99.99456f;
		
		System.out.printf("%f \n", f1);
		System.out.printf("%f \n", f2);
		
		System.out.printf("%.3f \n", f3);
		System.out.printf("%f \n", f4);
	}

}
