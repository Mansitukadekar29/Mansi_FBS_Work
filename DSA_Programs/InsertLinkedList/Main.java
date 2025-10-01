package p2;

import p1.*;
class Main {

	Node start;
	public static void main(String[] args) {

		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(40);
		Main add= new Main();
		
		add.insertAtEnd(n1);
		add.insertAtEnd(n2);
		add.insertAtEnd(n3);
		add.insertAtEnd(n4);
		add.insertAtBeg(n5);//temp value
		add.display();

	}

	public void insertAtEnd(Node ref) {
		
		if(start==null)
		{
			start=ref;
		}
		
		else {
			Node current=start;
			while(current.next != null)
			{
				current=current.next;
			}
			current.next=ref;
		}
		
	}

	void insertAtBeg(Node temp)
	{
		temp.next=start;
		start=temp;
	}
	void display()
	{
//		System.out.println("Start Data:" +start.data);
//		System.out.println("Start reference:" +start.ref);
		
		if(start==null)
		{
			System.out.println("In The node data is null");
		}
		else
		{
			Node itr=start;
			
			while(itr.next!=null)
			{
				System.out.print("["+itr.getData()+"]"+"->");
				itr=itr.next;
			}
			System.out.println("["+itr.getData()+"]"+"-> null");
		}
	}
	
}







//Delete node:


//package p2;
//
//import p1.Node;
//
//public class Main {
//
//	Node start;
//	public static void main(String[] args) {
//		
//		Main linkedlist = new Main();
//		Node n1 = new Node(1);
//		Node n2 = new Node(2);
//		Node n3 = new Node(3);
//		
//		linkedlist.insertAtEnd(n1);
//		linkedlist.insertAtEnd(n2);
//		linkedlist.insertAtEnd(n3);
////		linkedlist.deleteAtStart();
//		linkedlist.deleteAtEnd();
////		linkedlist.deleteAtPosition(3);
//		linkedlist.display();
//	}
//	
//	void insertAtEnd(Node newNode) {
//		if(start == null) {
//			start = newNode;
//		}
//		else {
//			Node itr = start;
//			while(itr.next != null) {
//				itr = itr.next;
//			}
//			itr.next = newNode;
//		}
//	}
//	
//	void display() {
//		if(start == null) {
//			System.out.println("No node is present here");
//		}
//		else {
//			Node itr = start;
//			while(itr.next != null) {
//				System.out.print("["+itr.getData()+"]->");
//				itr = itr.next;
//			}
//			System.out.print("["+itr.getData()+"]->null");
//		}
//	}
//	
//	void deleteAtStart() {
//		if(start==null) {
//			System.out.println("there is no node to delete");
//		}
//		else {
//			start = start.next;
//		}
//	}
//	
//	void deleteAtEnd(){
//		if(start==null) {
//			System.out.println("there is no node to delete");
//		}
//		else {
//			Node itr =start;
//			
//			while(itr.next.next != null) {
//				itr=itr.next;	
//			}
//			itr.next=null;
//			
//		}
//	}
//	
//	void deleteAtPosition(int pos) {
//		
//		Node itr = start;
//		
//		if(pos==1) {
//			deleteAtStart();
//			return;
//		}
//		
//		if(start==null) {
//			System.out.println("there is no node present");
//		}
//		else {
//			
//			int count = 1;
//			while(count < pos-1 && itr.next != null) {
//				itr = itr.next;
//				count++;
//			}
//			
//			if(pos==0) {
//				System.out.println("Position must be grater than Zero");
//				return;
//			}
//			
//			if(pos<0) {
//				System.out.println("Position can't be negative");
//				return;
//			}
//			
//			if(pos>count+1) {
//				System.out.println("Enter valid position to delete");
//				return;
//			}
//			
//			itr.next = itr.next.next;
//		}
//	}
//	
//}
