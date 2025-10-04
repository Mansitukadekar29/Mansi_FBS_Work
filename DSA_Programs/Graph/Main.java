package g1;

public class Main {

	public static void main(String[] args) {
		
		Graph graph=new Graph();
		Node n1 = new Node("Mansi");
		Node n2 = new Node("Mrunmayee");
		Node n3 = new Node("Rutika");
		
		graph.insertNode(n1);
		graph.insertNode(n2);
		graph.insertNode(n3);
		
		graph.connectNodes(n1, n2);
		graph.connectNodes(n1, n3);
		graph.connectNodes(n3, n1);
		graph.print();
		
	}

}
