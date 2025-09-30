
class Pro{
	int id,qut;
	String name;
	double salary;
	
	public Pro() {//default constructor
		System.out.println("In default constructor");
		this.id=1;
		this.qut=19;
		this.name="mansi";
		this.salary=90000;
	}

	//setters and getters
	int getId() {
		return id;
	}

	void setId(int id1) {
		this.id = id1;
	}

	int getQut() {
		return qut;
	}

	void setQut(int quantity) {
		this.qut = quantity;
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
		System.out.println("Id is:"+this.id);
		System.out.println("Name is:"+this.name);
		System.out.println("Quantity is:"+this.qut);
		System.out.println("Salary is:"+this.salary);
	}
	
	
}//Pro class ends here
class Product {

	public static void main(String[] args) {
		Pro p1;
		p1 = new Pro();
//		p1.display();
		
		p1.setId(2);
		p1.setName("Savita");
		p1.setQut(25);
		p1.setSalary(1200000);
//		System.out.println("After setting values:");
//		p1.display();
		
		Pro p2=new Pro();
		p1.setId(3);
		p1.setName("Om");
		p1.setQut(23);
		p1.setSalary(90000);
		p1.display();
		p2.display();
		
		if(p1.getSalary() > p2.getSalary()) {
		System.out.println(p1.getName()+" has greater salary");
	}
		else {
			System.out.println(p2.getName()+" has greater salary");
		}
			
		}

}
