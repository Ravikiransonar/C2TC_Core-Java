package oops.classtype.arrays;

public class Employee {
	int id;
	String name;
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "Jack");
		Employee employee2 = new Employee(102, "John");
		Employee employee3 = new Employee(103, "Ricky");
		Employee[] e = {employee1, employee2, employee3};
		
		for(int i = 0 ; i < e.length; i++){
			System.out.println("Id:"+e[i].id+" Name:"+e[i].name);
		}
	}
}