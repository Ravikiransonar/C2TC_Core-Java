package cap.java.basics.basicprograms.package1;

public class Program1 {
	static void test(float x){
		System.out.println("float");
	}
	static void test(double x){
		System.out.println("double");
	}
	public static void main(String[] args) {
		test(22.2f);
		test(22.2);
	}
}
