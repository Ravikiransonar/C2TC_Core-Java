package cap.java.basics.strings.package1;

public class Program6 {

	public static void main(String[] args) {
		// lastIndexOf(); doubt
		String s1 = "This is is the world"; //8th place
		int index4 = s1.lastIndexOf('s'); 
		System.out.println(index4); //6
		int index1 = s1.lastIndexOf("is"); 
		int index2 = s1.lastIndexOf("world"); 
		System.out.println(index1); //5
		System.out.println(index2); //12
 		int index3 = s1.lastIndexOf("is", 4); //  
		System.out.println(index3);
	}

}
