package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import p1.Product;

class idcomparator implements Comparator<Object> {
	
	@Override
	public int compare(Object o1, Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		
		return p1.id-p2.id ; 
	}

}

class Namecomparator implements Comparator<Object> {
	
	@Override
	public int compare(Object o1, Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		
		String s1=p1.name;
		String s2=p2.name;
		
		return s1.compareTo(s2) ; 
	}

} 
public	class TestProduct{
	public static void main(String[] args) {
		
		ArrayList<Product> a1=new ArrayList<>();
			Product p1 = new Product(101,"parleG");
			Product p2 = new Product(103,"Goodday");
			Product p3 = new Product(102,"HappyHAppy");
			
			a1.add(p1);
			a1.add(p2);
			a1.add(p3);

			System.out.println("Before"+a1);

//			Product p4 = new Product(102,"Goodday");
			
//			idcomparator c1=new idcomparator();
//	       Collections.sort(a1,c1);
//	       System.out.println("after"+a1);
	        
			Namecomparator c1=new Namecomparator();
		       Collections.sort(a1,c1);
		       System.out.println("after"+a1);
		}

	}
	


