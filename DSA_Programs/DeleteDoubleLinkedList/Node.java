package p1;

public class Node {

	int data;
	public Node next;
	public Node prev;
	
	public Node()
	{
		super();
	} //Default constructor ends here
	
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
		this.prev = null ;
	}//Parametised constructor ends here

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	
	
}//Node class ends here
