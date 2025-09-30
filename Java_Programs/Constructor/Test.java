
class Employee {
	int e_id;
	String name;
	double salary;
	
	 Employee() {//default constructor
		 System.out.println("In Default Constructor");
		 this.e_id=0;
		 this.name="Not Given";
		 this.salary=15000;
	}
	 //setters and getters
	
	int getE_id() {
		return e_id;
	}
	void setE_id(int id) {
		this.e_id = id;
	}
	String getName() {
		return name;
	}
	void setName(String n) {
		this.name = n;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double s) {
		this.salary = s;
	}
	
	void display() {
		System.out.println("Id of Employee:"+this.e_id);
		System.out.println("Name of Employee:"+this.name);
		System.out.println("Salary of Employee:"+this.salary);
		
	}
	
	
}//Employee Class ends here

class Test {

	public static void main(String[] args) {
		Employee e1; //Reference creation
		e1 = new Employee();
		//e1.display();
		
		e1.setE_id(101);
		e1.setName("Mansi");
		e1.setSalary(50000);
//		System.out.println("After Setting Values");
//		e1.display();
		
		Employee e2 = new Employee();
		e2.setE_id(102);
		e2.setName("Om");
		e2.setSalary(456789);
		e1.display();
		e2.display();
		
		if(e1.getSalary() > e2.getSalary()) {
			System.out.println(e1.getName()+" has greater salary");
			
		}
		else {
			System.out.println(e2.getName()+" has greater salary");
		}
	}

}
