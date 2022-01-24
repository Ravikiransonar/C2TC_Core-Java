package cap.java.basics.basicprograms.package1;

public class Program9 {
	String name;
	public static void main(String[] args) {
		Program9 c = new Program9();
		Program9 c1 = c;
		c1.name = "ravi";
		c = null;
		System.out. println(c.name);
	}

}
