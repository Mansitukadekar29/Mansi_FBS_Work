

class SM {
	int id,target;
	String name;
	double salary,incentive;
	
	 SM() {//default constructor
		 System.out.println("In default Constructor");
		this.id=1;
		this.target=10000000;
		this.name="mansi";
		this.salary=45000;
		this.incentive=1000;
		
	}

	 //setters and getters
	int getId() {
		return id;
	}

	void setId(int id1) {
		this.id = id1;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int targ) {
		this.target = targ;
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

	void setSalary(double sal) {
		this.salary = sal;
	}

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incent) {
		this.incentive = incent;
	}
	void display() {
		System.out.println("Id:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Salary:"+this.salary);
		System.out.println("incentive:"+this.incentive);
		System.out.println("target:"+this.target);
	}
	
	 
} //SM class ends here
class SalesManager {

	public static void main(String[] args) {
		SM s1;
		s1 = new SM();
		s1.display();
		
		s1.setId(1);
		s1.setName("mansi");
		s1.setSalary(345678);
		s1.setIncentive(123345);
		System.out.println("The target is:");
		s1.display();
		

	}

}
