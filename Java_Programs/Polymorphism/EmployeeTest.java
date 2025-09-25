
 abstract class Employee{
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
	double Calsal()
	{
		return salary;
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
	  double Calsal()
		{
			return salary + allowance;
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

	double Calsal()
	{
		return salary + incentive;
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
	double Calsal()
	{
		return salary + commission;
	}
	
}//class Hr ends here

class EmployeeTest {

	public static void main(String[] args) {
		Employee e1;//Generic Reference
//		e1=new Employee(101,"Mansi",90000);
//		e1.display();
//		System.out.println("Total Salary of Employee:"+e1.Calsal());
		
		e1=new SalesManager(101,"Mrunmayee",90000,1200,1000);
		e1.display();
		System.out.println("Total Salary of SalesManager:"+e1.Calsal());
		
		e1=new Admin(102,"Akanksha",90000,1200);
		e1.display();
		System.out.println("Total Salary of Admin:"+e1.Calsal());
		
		e1=new Hr(103,"Aboli",90000,7000);
		e1.display();
		System.out.println("Total Salary of Hr:"+e1.Calsal());
		
		
	}

}
