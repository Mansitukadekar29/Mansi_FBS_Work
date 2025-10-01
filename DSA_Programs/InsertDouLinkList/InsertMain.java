package p2;
import p1.Node;
class InsertMain {
	
	 Node start;
	 Node end;
	int count =1;
	int pos =2;

	public static void main(String[] args) {
	   
		
		InsertMain add=new InsertMain();
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		Node n5=new Node(50);
		
		add.insertAtEnd(n1);
		add.insertAtEnd(n2);
		add.insertAtEnd(n3);
		add.insertAtBeg(n4);
		add.insertAtAnypos(n5);
        add.display();
	}

	  
	
	void insertAtBeg(Node temp)
	{
		if(start==null)
		{
			start=temp;
			end=temp;
			
		}
		else {
			temp.next=start;
			start.prev=temp;
			start=temp;
		}
		count++;
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
	     ref.prev=end;
		end=ref;
	}
	count++;	
	}
	
	 void insertAtAnypos(Node ref) {
			
			if(pos < count/2) {
				Node itr=start;
				for(int i=1;i<pos-1;i++)
				{
					itr=itr.next;
				}
			}
			else {
				Node itr=end;
				for(int i=count;i>pos-1;i--)
				{
					itr=itr.prev;
				}
				ref.next=itr.next;
				ref.prev=itr;
				itr.next=ref;
				ref.next.prev=ref;
				count++;
			}
			
		}



	 void display() {
			if(start == null) {
				System.out.println("No node is present here");
			}
			else {
				Node itr = start;
				while(itr.next != null) {
					System.out.print("["+itr.getData()+"]->");
					itr = itr.next;
				}
				System.out.print("["+itr.getData()+"]->null");
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
				 System.out.print("["+itr.getData()+"]->");
					itr = itr.next; 
			 }
			 System.out.print("["+itr.getData()+"]->null");
		 }
	 }
	 else{
		 
			display();
		 }
	 
}


}
