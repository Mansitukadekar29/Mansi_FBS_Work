package DBConnect;
//
//public class Employee {
//    
//	int Eid;
//	String EName;
//	int ESalary;
//	
//	public Employee() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	public int getEid() {
//		return Eid;
//	}
//	public void setEid(int eid) {
//		Eid = eid;
//	}
//	public String getEName() {
//		return EName;
//	}
//	public void setEName(String eName) {
//		EName = eName;
//	}
//	public int getESalary() {
//		return ESalary;
//	}
//	public void setESalary(int eSalary) {
//		ESalary = eSalary;
//	}
//	
//	
//}
//
//
////------------------------------------------------------------------------------------------------------------


public class Employee {
	int id;
	String Emp_name;
	int salary;
	
	public Employee(int id, String emp_name, int salary) {
		super();
		this.id = id;
		Emp_name = emp_name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Emp_name=" + Emp_name + ", salary=" + salary + "]";
	}
	
	
}