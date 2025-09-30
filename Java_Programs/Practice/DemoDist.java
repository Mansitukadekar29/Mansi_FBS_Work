package Test;

class Dist {
	int feet;
	float inch;
}

class DemoDist{
	public static void main(String[] args) {
		Dist d1;
		d1 = new Dist();
		System.out.println(d1);
		System.out.println("Distance is:"+d1.feet+" feet:"+d1.inch+" inches");
		
	}

}
