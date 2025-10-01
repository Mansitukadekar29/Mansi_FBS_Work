package p2;
//import p1.*;
import p1.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node first = new Node (10);
		Node second = new Node(20);
		Node third  = new Node(30);
		Node fourth  = new Node(40);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		
		System.out.println("Head data: "+first.data);
		System.out.println("head reference: "+first.next);
		System.out.println("second data: "+second.data);
		System.out.println("second reference: "+second.next);
		System.out.println("third data: "+third.data);
		System.out.println("third reference: "+third.next);
		System.out.println("fourth data: "+fourth.data);
		System.out.println("fourth reference: "+fourth.next);
	}

}



