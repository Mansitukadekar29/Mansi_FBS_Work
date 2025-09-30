
class Product {
	int id,qut;
	char name;
	double price;
}

class DemoProd{

	public static void main(String[] args) {
		Product p1;
		p1 = new Product();
		System.out.println(p1);
		System.out.println("ID:"+p1.id+" Name:"+p1.name+" Price:"+p1.price*p1.qut+" Quantity:"+p1.qut);

	}

}
