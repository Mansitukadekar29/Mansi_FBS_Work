package DBConnect;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//public class DBconnectivity {
//
//	public static void main(String[] args) {
//		
//		ArrayList<Employee> listOfEmployee = new ArrayList<>();
//		// TODO Auto-generated method stub
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");  // step 1:load driver into memory 
//			
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Info","root","root");  //step 2:Establish the Connection
//			
//			Statement stmt = con.createStatement();  //step 3:Create Statement(hold the Statement of java)
//			
//			String query = "select * from Employee"; //step 4:prepare the required sql statement/define query
//				
//			//String query = "select * from Employee where Eid=4"; //specific data pahije asel tr condition lavychi
////			String query = "INSERT INTO Employee values(6,'Mansi Tukadekar',78000)";
////			
//			ResultSet rs = stmt.executeQuery(query); //step 5:Submit SQL Statement/Query to 
////			//rs.next(); //to shift the record 1st row to the 1st row  .rs to only pointing the db 
////		    
//			while(rs.next()) { //jevdhe data ahe tevde print karel 
//				
//				System.out.println(rs.getInt(1) + " "+rs.getString(2) + " " +rs.getInt(3));//step 6: Process the Results
//	            
//			}  
//			
////			String query = "INSERT INTO Employee values(8,'Mrunmayee surte',78000)";
////			int rs = stmt.executeUpdate(query);
//						
//			con.close(); //step 7: Close the Connection
//		
//		} catch (ClassNotFoundException e) { //class available nasel tr exception yeil
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) { //Sql query madhe error astil tr
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
//	}
//
//}



//----------------------------------------------------------------------------------------------------------------------------------



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class DBconnectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> listOfEmployee = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //step1:load driver into memory
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Info","root","root"); //Step 2:Establish the connection  (url,root,password)
			
			Statement stmt = con.createStatement();   //Step 3: Create statement  (statement(query ahe tyat sql chi) hold karun db javal jate )
			
//			String query = "insert into employee_info values(12,'Mrunmayee Surate',75000)";   //step 4 : prepare the required sql statement/define queries
//			
//			int rs = stmt.executeUpdate(query);  //Step 5: Submit sql statement/query to DB
//			if(rs==1){
		//           System.out.println("Query ok , "+rs+" rows affected.");
		//}
			
//			String query = "update employee_info set emp_name = 'Mansi Tukadekar' where emp_id=12";
//			int rs = stmt.executeUpdate(query);
			
			String query1 = "select * from Employee";
			//rs.next(); //to shift the record from zeroth row to first row. rs only pointing to db,rs is not holding the actual data it its point the records.
			ResultSet rs1 = stmt.executeQuery(query1);
			while(rs1.next()) {  //rs.next() return true or false.
				
			//System.out.println(rs1.getInt(1) + " "+rs1.getString(2)+" "+rs1.getInt(3)); //Step 6 : process the results
			
				int id = rs1.getInt(1);
				String name = rs1.getString(2);
				int salary = rs1.getInt(3);
				
				Employee e = new Employee(id,name,salary);
				listOfEmployee.add(e);
			}
			
			con.close();//Step 7 : close the connection
		} 
		
			catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block 
			//class nasel tr he exception yeil
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//query madhe error asel tr
			e.printStackTrace();
		}
		
		for(Employee emp : listOfEmployee ) {
			System.out.println("---------------------------------------------------------");
			System.out.println(emp);
		}

		
	}
	
}

//executeQuery  return ResultSet used for select query
//executeUpdate() return integer  used for how many rows affected.(INSERT,UPDATE,DELETE)
//excute() return boolean used for how many rows affected.(INSERT,UPDATE,DELETE)
