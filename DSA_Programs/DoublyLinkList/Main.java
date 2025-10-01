package p2;
import p1.Node;
class Main {
	
	Node start;
	Node end;

	public static void main(String[] args) {
	   
		
		Main add=new Main();
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		
		add.insertAtEnd(n1);
		add.insertAtEnd(n2);
		add.insertAtEnd(n3);
        add.display();
	}

	 void insertAtEnd(Node ref) {
	if(start==null) 
	{
		start=ref;
		end=ref;
//		System.out.println("No Data is present in Node");
	}
	else
	{
		end.next=ref;
		ref.ref=end;
		end=ref;
	}
		
	}

	 void display() {
			if(start == null) {
				System.out.println("No node is present here");
			}
			else {
				Node itr = start;
				while(itr.next != null) {
					System.out.print("["+itr.getPlayload()+"]->");
					itr = itr.next;
				}
				System.out.print("["+itr.getPlayload()+"]->null");
			}
		} 
	 
	 void display(boolean ch)
	 {
		 if(ch==true)
		 {
			 if(start==null)
			 {
				 System.out.println("No node is present here"); 
			 } 
		 
		 else
		 {
			 Node itr=end;
			 while(itr.start!=null)
			 {
				 System.out.print("["+itr.getPlayload()+"]->");
					itr = itr.next; 
			 }
			 System.out.print("["+itr.getPlayload()+"]->null");
		 }
	 }
	 else{
		 
			display();
		 }
	 
}


}
