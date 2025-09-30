package mansi;



class Time{ 
	int hrs=13,min=21,sec=56;
}
class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1;
		t1=new Time();
		System.out.println(t1);
		
		
		Time t2;
		t2=new Time();
		System.out.println(t2);
		System.out.println("Time is: "+t1.hrs+ ":" +t1.min+":" +t1.sec);
		

	}

}


