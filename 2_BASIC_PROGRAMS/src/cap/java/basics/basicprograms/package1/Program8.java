package cap.java.basics.basicprograms.package1;

public class Program8 {
	
	void start() {
		String stra = "do";
		String strb = method(stra); 
		System.out.print(": " + stra + strb); 
		}
	
	String method(String stra) {
		stra = stra + "good";
		System.out.print(stra); 
		return " good";
		}
	public static void main(String[] args) {
			Program8 obj = new Program8();
			obj.start();
			}
}
