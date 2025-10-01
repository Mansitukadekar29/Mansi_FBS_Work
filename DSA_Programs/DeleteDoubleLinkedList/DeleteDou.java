package p2;

import p1.*;

public class DeleteDou {
		Node Start;
		Node end;
	
		public static void main(String[] args) {
			Node n1=new Node(10);
			Node n2=new Node(20);
			Node n3=new Node(30);
			Node n4=new Node(40);
			DeleteDou d1=new DeleteDou();
			
			d1.insert(n1);
			d1.insert(n2);
			d1.insert(n3);
			d1.insert(n4);
//			d1.deleteAtStart();
//			d1.deleteAtEnd();
			d1.deleteAtPos(2);
			d1.display();

		}
		
		 void insert(Node ref) {
				if(Start==null) {
					end=ref;
					Start=ref;
				}
				else {
					end.next=ref;
					ref.prev =end;
					end=ref;
				}
		 }
		void display() {
			if(Start==null) {
				System.out.println("no need insert");
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
		
		
		
			void display(boolean choice) {
				if(choice==true) {
					if(end==null) {
						System.out.println("No Data Insert");
					}
					else {
						Node itr=end;
						while(itr.prev!=null) {
							System.out.println("["+itr.getData()+"]->");
							itr=itr.prev;
						}
						System.out.println("["+itr.getData()+"]->null");
					    }
				   }
				else {
					display();
				}
			}
			
		
			void deleteAtStart() {
			    if (Start == null) {
			        System.out.println("List is empty");
			        return;
			    }

			    if (Start.next != null) {
			        Start = Start.next;
			        Start.prev = null;
			    } else {
			       
			        Start = null;
			        end = null;
			    }
			}

			void deleteAtEnd() {
			    if (Start == null) {
			        System.out.println("List is empty");
			        return;
			    }

			    if (end.prev != null) {
			        end = end.prev;
			        end.next = null;
			    } else {
			     
			        Start = null;
			        end = null;
			    }
			}

			void deleteAtPos(int pos) {
			    if (Start == null) {
			        System.out.println("List is empty");
			        return;
			    }

			    //delete at start
			    if (pos == 1) {
			        deleteAtStart();
			        return;
			    }

			    Node current = Start;
			    int no = 1;

			    while (current != null && no < pos) {
			        current = current.next;
			        no++;
			    }

			    if (current != null && no == pos) {
			       //delete at end
			        if (current.next == null) {
			            deleteAtEnd();
			            return;
			        }

			        // Delete any node
			        current.prev.next = current.next;
			        current.next.prev = current.prev;

			    } else {
			        System.out.println("Position out of range");
			    }
			}
}//main class ends here