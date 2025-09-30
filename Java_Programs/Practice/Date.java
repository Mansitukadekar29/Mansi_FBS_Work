package mansi;



class Date {

	int  day,month,year;
	void setDay(int d)
	{
		this.day=d;
	}
	void setMonth(int m)
	{
		this.month=m;
	}
	void display()
	{
	System.out.println("Date id:" + this.day +"/"+ this.month +"/" + this.year);
		// TODO Auto-generated method stub

	}
	 void setYear(int i) {
		this.year=i;
		
	}
	

}
 class Test {

	public static void main(String[] args) {
		Date d1;
		d1=new Date();
		d1.setDay(23);//d1.day=23;
		d1.setMonth(6);//d1.month=6;
		d1.setYear(2025);//d1.year=2025;
		d1.display();
		//System.out.println(d1);
		
		
		Date d2;
		d2=new Date();
		d2.setDay(29);//d2.day=29;
		d2.setMonth(5);//d2.month=5;
		d2.setYear(2005);//d2.year=2003;
		d2.display();
		//System.out.println(d2);
		
		
	}

}
