
import java.io.*;
import java.util.*;

 class Employee implements Serializable {
     int id;
    
    String name;
    double salary;

  Employee() {
	  this.id=0;
	  this.name="not given";
	  this.salary=1000;
	  
  }

     Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "ID=" + id + ", Name=" + name + ", Salary=" + salary;
    }
}//class Employee ends here

 class Admin extends Employee {
    double allowance;

    Admin() {
        super();
        this.allowance = 100;
    }

    Admin(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    public String toString() {
        return "Admin = " + super.toString() + ", Allowance=" + allowance;
    }
}//class Admin ends here

 class SalesManager extends Employee {
    double incentive;
    int target;

    SalesManager() {
        this.incentive = 200;
        this.target = 500;
    }

    SalesManager(int id, String name, double salary, double incentive, int target) {
        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

     public String toString() {
        return "Sales Manager = " + super.toString() + ", Incentive=" + incentive + ", Target=" + target;
    }
}//class SalesManager ends here

 class HR extends Employee {
    double commission;

     HR() {
        this.commission = 100;
    }

   HR(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }

    public String toString() {
        return "HR = " + super.toString() + ", Commission=" + commission;
    }
    
}//class HR ends here
 
 class IdComparator implements Comparator<Employee>
 {
	    public int compare(Employee e1, Employee e2) {
	        return e1.id - e2.id;
	    }
}//class IdComparator ends here

class NameComparator implements Comparator<Employee> 
{
	    public int compare(Employee e1, Employee e2) {
	        return e1.name.compareTo(e2.name);
	    }
}//class NameComparator ends here

class SalaryComparator implements Comparator<Employee> 
{
	    public int compare(Employee e1, Employee e2) {
	        return Double.compare(e1.salary, e2.salary);
	    }
}//class SalaryComparator ends here



public class EmployeeDemo {
     static Scanner sc = new Scanner(System.in);
     static ArrayList<Employee> empList = new ArrayList<Employee>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n**********Employee Menu**********");
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee By ID");
            System.out.println("3. Search Employee By ID");
            System.out.println("4. Update Employee Info");
            System.out.println("5. Sort Employees");
            System.out.println("6. Display Employees");
            System.out.println("7. Save to File (Permanent)");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:addEmployee();
                break;
                case 2:deleteEmployee();
                break;
                case 3:searchEmployee(); 
                break;
                case 4:updateEmployee();
                break;
                case 5:sortEmployees(); 
                break;
                case 6:displayEmployees();
                break;
                case 7:saveToFile();
                break;
                case 8: 
                    System.out.println("Exit");
                break;
                default:
                	System.out.println("Invalid choice.");
            }
        } while (choice!=7);
     }

    static void addEmployee() {
        System.out.print("Enter ID:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name:");
        String name = sc.nextLine();
        System.out.print("Enter Salary:");
        double salary = sc.nextDouble();

        System.out.println("Choose Type: 1.HR 2.Admin 3.Sales Manager");
        int type=sc.nextInt();
        Employee emp=null;

        if (type==1) 
        {
            System.out.print("Enter Commission: ");
            double comm = sc.nextDouble();
            emp=new HR(id,name,salary,comm);
        } 
        else if (type==2)
        {
            System.out.print("Enter Allowance: ");
            double allowance=sc.nextDouble();
            emp=new Admin(id,name,salary,allowance);
        } 
        else if (type==3) 
        {
            System.out.print("Enter Incentive: ");
            double inc=sc.nextDouble();
            System.out.print("Enter Target: ");
            int target=sc.nextInt();
            emp = new SalesManager(id,name,salary,inc,target);
        } 
        else
        {
            System.out.println("Invalid Type");
            return;
        }

        empList.add(emp);
        System.out.println("Employee added.");
    }

    static void deleteEmployee() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        boolean found = false;
        for (int i=0;i<empList.size();i++)
        {
            Employee e=empList.get(i);
            if (e.id==id)
            {
                empList.remove(i); // remove by index
                found = true;
                System.out.println("Employee deleted.");
                break;
            }
        }

        if (found==false)
            System.out.println("Employee not found.");
    }


    static void searchEmployee()
    {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();
        boolean found = false;

        for (Employee e : empList) 
        {
            if (e.id==id) {
                System.out.println("Found: " + e);
                found=true;
                break;
            }
        }

        if (found==false) 
        	System.out.println("Employee not found.");
    }

    static void updateEmployee() {
        System.out.print("Enter ID to update: ");
        int id=sc.nextInt();
        boolean found=false;

        for (Employee e:empList)
        {
            if (e.id==id) 
            {
                sc.nextLine();
                System.out.print("Enter New Name: ");
                e.name = sc.nextLine();
                System.out.print("Enter New Salary: ");
                e.salary = sc.nextDouble();
                System.out.println("Employee updated.");
                found = true;
                break;
            }
        }

        if (found==false) 
        	System.out.println("Employee not found.");
    }

    static void sortEmployees() {
        System.out.println("Sort by: 1.ID  2.Name  3.Salary");
        int option = sc.nextInt();

        if (option==1) 
        {
            Collections.sort(empList, new IdComparator());
        } 
        else if (option==2) 
        {
            Collections.sort(empList, new NameComparator());
        } 
        else if (option==3) 
        {
            Collections.sort(empList, new SalaryComparator());
        } 
        else 
        {
            System.out.println("Invalid sort option.");
            return;
        }

        System.out.println("Sorted Employees:");
        for (Employee e:empList)
            System.out.println(e);
    }
    
    static void displayEmployees() {
    	if(empList.isEmpty()) 
    	{
    		System.out.println("No employees to Display");
    		
    	}
    	else {
    		System.out.println("Employees List");
    		for(Employee e:empList) {
    			System.out.println(e);
    		}
    	}
    }


    static void saveToFile() {
        try {
        		FileOutputStream fos=new FileOutputStream("myfile.txt");
    			ObjectOutputStream oos=new ObjectOutputStream(fos);
    			oos.writeObject(empList);
    			System.out.println("data stored");
    			System.out.println(empList);
    			
        } catch (Exception e)
        {
        	e.printStackTrace();
        }
    }
}//class EmployeeDemo Ends here
