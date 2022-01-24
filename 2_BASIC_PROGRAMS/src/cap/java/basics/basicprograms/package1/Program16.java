package cap.java.basics.basicprograms.package1;

public class Program16 {
	Program16(){
		System.out.println("hello");
	}
	Program16(int x){
		this();
		System.out.println(x);
	}
	public static void main(String[] args) {
		Program16 obj = new Program16(10);
	}

}
