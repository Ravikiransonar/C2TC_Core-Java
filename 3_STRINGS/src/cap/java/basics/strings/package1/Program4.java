package cap.java.basics.strings.package1;

public class Program4 {

	public static void main(String[] args) {
		//equalsIgnoreCase();
		String str1 = "hello how are you";
		String str2 = "HELLO HOW ARE YOU";
		String str3 = "hello HOW are YOU";
		String str4 = "hello";
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println(str3.equalsIgnoreCase(str4));
	}

}
