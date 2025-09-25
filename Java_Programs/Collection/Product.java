
public class Product {
	int id;
	String name;
	
	

	int getId() {
		return id;
	}



	void setId(int id) {
		this.id = id;
	}



	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


 Product() {
	this.id=0;
	this.name="not given";
}
 

	public Product(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

}

class Test{

	public static void main(String[] args) {
		
	}

}
