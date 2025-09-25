
class Employee{
	int id;
	String name;
	double salary;
	 Employee() {
		this.id=100;
		this.name="Not Given";
		this.salary=50000;
		
	}
	 Employee(int i,String nm,double s){
		 this.id=i;
		 this.name=nm;
		 this.salary=s;
		 
	 }
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	 
	void display() {
		System.out.println("ID is:"+this.id);
		System.out.println("Name :"+this.name);
		System.out.println("Salary:"+this.salary);
		
	}
}//class Employee ends here

class Admin extends Employee{
	double allowance;
	
	 Admin() {
		super();
		this.allowance=1200;
	}
	 
      Admin(int i,String nm,double s,double a){
    	  super(i,nm,s);
    	  this.allowance=a;
      }
      
	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	  void display() {
		  super.display();
		  System.out.println("Allowance:"+this.allowance);
	  }
}//class Admin ends here

class SalesManager extends Employee{
	double incentive;
	int target;
	
	SalesManager() {
		super();
		this.incentive=2000;
		this.target=5;
	}
	SalesManager(int i,String nm,double s,double in,int t){
		super(i,nm,s);
		this.incentive=in;
		this.target=t;
	}
	
	double getIncentive() {
		return incentive;
	}
	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	
	void display() {
		super.display();
		System.out.println("Incentive:"+this.incentive);
		System.out.println("Target:"+this.target);
		
		}

}//class SalesManager ends here
	
class Hr extends Employee{
	double commission;
	
	Hr() {
		super();
		this.commission=3000;
		
	}
	Hr(int i,String nm,double s,double c){
		super(i,nm,s);
		this.commission=c;
	}
	double getCommission() {
		return commission;
	}
	void setCommission(double commission) {
		this.commission = commission;
	}
	
	void display() {
		super.display();
		System.out.println("Commisssion:"+this.commission);
	}
}//class Hr ends here

class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.display();
		Employee e2=new Employee(101,"Mansi",90000);
		e2.display();
		Admin a1=new Admin();
		a1.display();
		Admin a2=new Admin(102,"Akanksha",50000,3000);
		a2.display();
		SalesManager s1=new SalesManager();
		s1.display();
		SalesManager s2=new SalesManager(103,"Mrunmayee",70000,6000,3);
		s2.display();
		Hr h1=new Hr();
		h1.display();
		Hr h2=new Hr(104,"Aboli",40000,7000);
		h2.display();
		
	}

}
