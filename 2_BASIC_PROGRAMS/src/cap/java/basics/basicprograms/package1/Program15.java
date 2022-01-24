package cap.java.basics.basicprograms.package1;
import java.util.Scanner;
public class Program15 {
	//Doubt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, count = 0;
		while(sc.hasNextInt()){
			int num = sc.nextInt();
			sum += num;
			count++;
		}
		int mean = sum/count;
		System.out.println("Mean is:"+mean);
	}
}
