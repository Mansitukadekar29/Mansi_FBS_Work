import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	
	String name;
	int rollno;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getRollno() {
		return rollno;
	}
	void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	 Student() {
		this.name="Not Given";
		this.rollno=101;
		
	}
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		System.out.println("Inside CompareTo");
		return 0;
	}
	 
	
}//class Student ends here
class StudentCollection1 
{

	public static void main(String[] args) {
		ArrayList<Student> alist=new ArrayList<Student>();
		Student s1=new Student("mrunmayee",102);
		Student s2=new Student("rutika",103);
		
		alist.add(s1);
		alist.add(s2);
		
		System.out.println("alist");
		Student s3=new Student("rutika",103);
		Collections.sort(alist);
		if(alist.contains(s3)) {
		System.out.println("Found");}
		else {
			System.out.println("Not Found");
		
		}

	}

}
