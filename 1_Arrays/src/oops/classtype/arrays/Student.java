package oops.classtype.arrays;

public class Student {
	int age;
	Student(int age){
		this.age = age;
	}
	public static void main(String[] args) {
		Student student1 = new Student(22);
		Student student2 = new Student(23);
		
		//Array of objects;
		Student[] s = {student1, student2};
		for(int i = 0; i<s.length; i++){
			System.out.println(s[i].age);
		}
	}

}
