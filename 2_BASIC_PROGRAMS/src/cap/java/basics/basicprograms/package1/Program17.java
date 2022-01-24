package cap.java.basics.basicprograms.package1;

public class Program17 {

	public static void main(String[] args) {
		//autoboxing;
		int i = 10;
		Integer j = i; //autoboxing;
		Integer k = Integer.valueOf(i); //Converting int to Integer explicitly.
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

}
