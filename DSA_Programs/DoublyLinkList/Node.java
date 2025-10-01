package p1;

public class Node {
	int playload;
	public Node start;
	public Node end;
	public Node next;
	public Node ref;
	
	
	Node()
	{
		
	}

	public Node(int playload) {
		super();
		this.playload = playload;
		this.start = null;
		this.end = null;
	}

	public int getPlayload() {
		return playload;
	}

	public void setPlayload(int playload) {
		this.playload = playload;
	}

	public Node getStart() {
		return start;
	}

	public void setStart(Node start) {
		this.start = start;
	}

	public Node getEnd() {
		return end;
	}

	public void setEnd(Node end) {
		this.end = end;
	}



}
