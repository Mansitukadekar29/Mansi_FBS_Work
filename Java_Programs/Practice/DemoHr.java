package Test;

class Hr {
	int id;
	char name;
	double salary,commission;
}

class DemoHr{

	public static void main(String[] args) {
		Hr h1;
		h1 = new Hr();
		System.out.println(h1);
		System.out.println("ID is:"+h1.id+" Name:"+h1.name+" salary:"+h1.salary+" commission:"+h1.commission);
	}

}
