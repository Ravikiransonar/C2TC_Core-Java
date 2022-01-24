package cap.java.basics.strings.package1;

public class Program1 {

	public static void main(String[] args) {
		//substring();
		String str1 = "Welcome to strings";
		String substring1 = str1.substring(0, 7); //It wont count last index
		System.out.println(str1);
		System.out.println(substring1);
		System.out.println(str1.substring(11)); //It count start index.
	}

}
