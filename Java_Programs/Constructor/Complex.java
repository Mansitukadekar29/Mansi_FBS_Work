
class Com {
	int real,img;
	
	 Com() {//default constructor
		System.out.println("In default costructor"); 
		this.real=5;
		this.img=3;
	}
	 //setters and getters

	int getReal() {
		return real;
	}

	void setReal(int r) {
		this.real = r;
	}

	int getImg() {
		return img;
	}

	void setImg(int i) {
		this.img = i;
	}
	
	void display() {
		System.out.println("Real no is:"+this.real);
		System.out.println("Imaginary no is:"+this.img + "i" );
		
	}
	 
}// Com class ends here

class Complex {

	public static void main(String[] args) {
		Com c1;
		c1 = new Com();
//		c1.display();
		
		c1.setReal(10);
		c1.setImg(5);
		//System.out.println("The Imaginary no is:");
//		c1.display();
		
		Com c2=new Com();
		c2.setReal(17);
		c2.setImg(6);
		c1.display();
		c2.display();
		
		
		

	}

}
