
class Student{
	int fid,dist;
	String name;
	
	int getFid() {
		return fid;
	}
	void setFid(int fid) {
		this.fid = fid;
	}
	int getDist() {
		return dist;
	}
	void setDist(int dist) {
		this.dist = dist;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	static int count=0;
	Student()
	{
		//count++;
		this.fid=100;
		this.name="not given";
		this.dist=0;
	}
	
	Student(int i, String nm, int d )
	{
		this.fid=i;
		this.name=nm;
		this.dist=d;
	}
//	static void getcount()
//	{
//		System.out.println("Total is:"+ count);
//	}

void display()
{
	System.out.println("Id is:"+this.fid);
	System.out.println("Name is:"+this.name);
	System.out.println("Distance is:"+this.dist);
}
}//class ends here

class PlacedStudent extends Student //Inheritance step no.1 "is-a " relation
{
	String cName,des;
	
	
	String getcName() {
		return cName;
	}


	void setcName(String cName) {
		this.cName = cName;
	}


	String getDes() {
		return des;
	}


	void setDes(String des) {
		this.des = des;
	}


	PlacedStudent(){
		super();
		this.cName="Not given";
		this.des="Not given";
		
	}
	PlacedStudent(int i,String nm, int d, String cn,String de){
		super(i,nm,d);
		this.cName=cn;
		this.des=de;
		
	}
	void display() {
	super.display();
		System.out.println("Company Name is:"+this.cName);
		System.out.println("Designation is:"+this.des);
	}
		
}//class PlaceStudent ends here


class InheritanceDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		//s1.display();
		Student s2 = new Student();
		Student s3 = new Student();
		//Student.getcount();//3 without inheritance
		PlacedStudent ps1 = new PlacedStudent();
		//Ps1.display();
		PlacedStudent ps2 = new PlacedStudent();
		//Student.getcount();//5 with inheritance
		ps2.display();
		
		
	}

}
