package oops.classtype.arrays;

public class Mobile {
	String brand, modelno;
	double cost;
	Mobile(String brand, String modelno, double cost){
		this.brand = brand;
		this.modelno = modelno;
		this.cost = cost;
	}
	public static void main(String[] args) {
		Mobile mobile1 = new Mobile("lenovo", "RS988", 8000.00);
		Mobile mobile2 = new Mobile("Oppo", "TS988", 12000.00);
		Mobile mobile3 = new Mobile("Apple", "MS988", 18000.00);
		Mobile[] m = {mobile1, mobile2, mobile3};
		for(int i = 0; i<m.length; i++){
			System.out.println("Brand: "+m[i].brand+" modelno: "+m[i].modelno+" cost: "+m[i].cost);
		}
	}

}
