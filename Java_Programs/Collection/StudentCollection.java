import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

class Student implements Comparable<Student>
{
	String name;
	int RollNo;
	int marks;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getRollNo() {
		return RollNo;
	}
	void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	int getMarks() {
		return marks;
	}
	void setMarks(int marks) {
		this.marks = marks;
	}
	
      Student() {
    	  this.name="Not Given";
    	  this.RollNo =0;
    	  this.marks=0;	
	}
	 Student(String name, int rollNo, int marks) {
		super();
		this.name = name;
		RollNo = rollNo;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\nStudent [name=" + name + ", RollNo=" + RollNo + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student s2) {
		System.out.println("Inside CompareTo");
		return this.RollNo - s2.RollNo;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside equals");
		Student s2 = (Student) obj;
		return this.RollNo == s2.RollNo;

	}
	
	@Override
	public int hashCode() {
		System.out.println("Inside hashCode");
		return this.RollNo;

	}   
	
}// Class ends here


	
public class StudentCollection {
	
	public static void main(String[] args) {
		HashSet<Student> h1 = new HashSet<Student>();
		Student s1 = new Student("Mansi",12,89);
		Student s2 = new Student("Mrunmayee",13,98);
		Student s3 = new Student("Akanksha",14,88);
		
		h1.add(s1);
		h1.add(s2);
		h1.add(s3);

		System.out.println(h1);

		Student s4 = new Student("Mrunmayee",13,98);

		if (h1.contains(s4)) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

	}
	
	public static void main2(String[] args) {
		TreeSet<Student> t1 = new TreeSet<Student>();
		Student s1 = new Student("Mansi",12,89);
		Student s2 = new Student("Mrunmayee",13,98);
		Student s3 = new Student("Akanksha",14,88);
		
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);

		System.out.println(t1);

		Student s4 = new Student("Mrunmayee",13,98);

		if (t1.contains(s4)) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

	}
	
	public static void main1(String[] args) {
		ArrayList<Student> slist = new ArrayList<Student>();
		Student s1 = new Student("Mansi",12,89);
		Student s2 = new Student("Mrunmayee",13,98);
		Student s3 = new Student("Akanksha",14,88);
		
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);

		System.out.println(slist);

		Student s4 = new Student("Mrunmayee",13,98);
		
        Collections.sort(slist);
        
		if (slist.contains(s4)) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

	}
	
	public static void main3(String[] args) {
		LinkedList<Student> s1 = new LinkedList<Student>();
		s1.add(new Student("Mrunmayee",13,98));

		System.out.println(s1);
	
	}	
}


		



