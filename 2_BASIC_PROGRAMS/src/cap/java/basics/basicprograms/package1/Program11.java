package cap.java.basics.basicprograms.package1;

public class Program11 {
	String name;
	public static void main(String[] args) {
	Program11 p1 = new Program11();
	p1.name = " C2TC "; 
	Program11 p2 = p1;
	p1 = null;
	System.out.println(p2.name); //C2TC
	new Program11();	
	Program11 p3;
//	p3.name = " C2TC "; 
//	System.out.println(p3.name);
	}
	}