package p2;
import p1.*;

public class Delete {
	Node Start;
	public static void main(String[] args) {
		
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		
      Delete d1=new Delete();
		
		d1.insertAtend(n1);
		d1.insertAtend(n2);
		d1.insertAtend(n3);
//		d1.deleteatbeg();
//		d1.deleteatend();
		d1.deleteatpos(2);
		d1.display();

	}
	
	 
	 void insertAtend(Node ref) {
		if(Start==null) {
			Start=ref;
		}
		else {
			Node Current=Start;
			while(Current.next!=null) {
				Current=Current.next;
			}
			Current.next=ref;           //at the end add
		}	
		
	}
	 void display() {
//		  System.out.println("Start data"+Start.data);
//		  System.out.println("Start data"+Start.next);
		 if(Start==null) {
			 System.out.println("no node insert");
		 }
		 else {
			 Node itr=Start;
			 while(itr.next!=null) {
				 System.out.print("["+itr.getData()+"]"+"->");
				 itr=itr.next;
			 }
			 System.out.print("["+itr.getData()+"]"+"->null");   
		 }
	 }
	 
	 
	 void deleteatbeg() {
		 if(Start==null) {
			 System.out.println("there is no need to delte node");
		 }
		 else {
			 Start=Start.next;
		 }
	 }
	 
	 void deleteatend() {
		 if(Start==null) {
		  System.out.println("no delete");
		 }
		 else {
			 Node itr=Start;
			 while(itr.next.next!=null) {
				 itr=itr.next;
			 }
			 itr.next=null;
			 
		 }
	 }
   
	  
	 void deleteatpos(int pos) {
		 if(pos==1) {
			 deleteatbeg();
			 return;
		 }
		 else {
		 int count=1;
		 Node itr=Start;
		 while((count<pos-1)&&(itr.next!=null)) {
			  count++;
			  itr.next=null;
		
		 }	
		 if(pos==0) {
			 System.out.println("pos is not  possible at zero");
		 }
		 
		 if(pos<0) {
			 System.out.println("pos are not negative");
		 }
		 itr.next=itr.next.next;
		 } 
      }
}