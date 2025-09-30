package p2;

import java.util.*;

import p1.Student;

class RollnoComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		
		return s1.getRollno() - s2.getRollno();
	}
	
}//RollNo class ends here

class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student t1 = (Student) o1;
		Student t2 = (Student) o2;
		
		String s1= t1.getName();
		String s2= t2.getName();
        return s1.compareTo(s2);

	}
	
	
}//NameComparator ends here

class MarksComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student m1=(Student) o1;
		Student m2=(Student) o2;
		
		return m1.getMarks() - m2.getMarks();
	}
	
}//Marks class ends here 


public class TestStudent {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		ArrayList<Student> a1 = new ArrayList<Student>();

		int choice;
		do {
			System.out.println("  Student Management List  ");
			System.out.println("1. Add Student");
			System.out.println("2. Display Student");
			System.out.println("3. Remove Student");
			System.out.println("4. Sorted by Students RollNumber");
			System.out.println("5. Sorted by Students Name");
			System.out.println("6. Sorted by Students Marks");
			System.out.println("7. Update Student");
			System.out.println("8. Exit");
			System.out.println("Enter Your Choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Student RollNo:");
				int roll=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Student Name:");
				String name=sc.nextLine();
				System.out.println("Enter Student Marks:");
				int marks=sc.nextInt();
				
				a1.add(new Student(roll,name,marks));
				System.out.println("Student Added Successfully");
				break;
				
			case 2:
				for(Student s:a1) {
				System.out.println(a1);
				
			}
				break;	
			case 3:
				System.out.println("\n Enter RollNo to Remove Student:");
			    int rollnoRemove=sc.nextInt();
				a1.removeIf(s->s.getRollno()==rollnoRemove);
				System.out.println("Remove student Successfully");
				break;
			    
			case 4:
				RollnoComparator rnc = new RollnoComparator();
				Collections.sort(a1,rnc);
		        System.out.println("\n sorted by RollNo:" +a1 );
			    break;
			    
			case 5:
				NameComparator nnc = new NameComparator();
				Collections.sort(a1,nnc);
				System.out.println("\nsorted by Student Name:" +a1);
				break;
				
			case 6:
				MarksComparator mnc = new MarksComparator();
				Collections.sort(a1,mnc);
				System.out.println("\nSorted by Student Marks:" +a1);
				break;
				
			case 7:
				//update
				System.out.print("Enter Roll No to Update: ");
                int rollToUpdate = sc.nextInt();
                sc.nextLine(); // consume newline
                boolean updated = false;
                for (Student s : a1) {
                    if (s.getRollno() == rollToUpdate) {
                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter New Marks: ");
                        int newMarks = sc.nextInt();
                        s.setName(newName);
                        s.setMarks(newMarks);
                        System.out.println("Student updated successfully!");
                        updated = true;
                        break;
                    }
                }
				
			case 8:
				System.out.println("Exit Program.");
				break;
				
		    default:
		    	System.out.println("Invalid Choice");
			}	
		}while(choice!=8);
		sc.close();
    }
}

		
		
//		System.out.println("\nBefore Marks:" +a1);//Sort by Marks
//		MarksComparator nc = new MarksComparator();
//		Collections.sort(a1,nc);
//		System.out.println("\nafter Marks:" +a1);
		
//        System.out.println("\nBefore RollNo:" +a1);//Sort by RollNo
//		RollnoComparator nc1 = new RollnoComparator();
//		Collections.sort(a1,nc1);
//        System.out.println("\nafter RollNo:" +a1 );
        
//        System.out.println("\nBefore Name:" +a1);//Sort by Name
//		NameComparator nc2 = new NameComparator();
//		Collections.sort(a1,nc2);
//		System.out.println("\nafter Name:" +a1);
//		}
//}

//		a1.remove(s2); // remove Student
//		System.out.println("\nAfter Removing Student:" +a1);

//
//	
//	}
//}
