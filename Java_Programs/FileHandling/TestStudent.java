import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	int rollno;
	String name;
	
	int getRollno() {
		return rollno;
	}
	void setRollno(int rollno) {
		this.rollno = rollno;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	 Student() {
		this.rollno=101;
		this.name="Mansi";
	}
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	 
	
	
}//class Student ends here
class TestStudent {

	
	public static void main1(String[] args) {
		try {
			Student s1=new Student();
			FileOutputStream fos=new FileOutputStream("myFile.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			System.out.println("Data Stored");
		}
       catch(Exception e) {
    	   e.printStackTrace();
       }
	}

	public static void main(String[] args) {
		try {
			
			FileInputStream fis=new FileInputStream("myFile.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Student s1=(Student)ois.readObject();
			System.out.println(s1);
		}
       catch(Exception e) {
    	   e.printStackTrace();
       }
	}
}
