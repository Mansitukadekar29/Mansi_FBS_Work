package p1;

public class Product {
	public int id;
	public String name;
	
	

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


public Product() {
	this.id=101;
	this.name="Goodday";
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

