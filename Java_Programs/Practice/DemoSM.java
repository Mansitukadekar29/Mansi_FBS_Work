
class SalesManager {
	int id,target;
	String name;
	double salary,incentive;
}

class DemoSM{

	public static void main(String[] args) {
		SalesManager s1;
		s1 = new SalesManager();
		System.out.println(s1);
		System.out.println("ID:"+s1.id+" Name:"+s1.name+" Salary:"+s1.salary+" incentive:"+s1.incentive);

	}

}
