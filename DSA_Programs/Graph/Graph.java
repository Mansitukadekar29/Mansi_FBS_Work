package g1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	
	Map<Node, List<Node>> adjacencyList;
	
	public Graph() {
		adjacencyList = new HashMap();
	}
	
	public void insertNode(Node v1)
	{
		adjacencyList.put(v1,new ArrayList());
	}
	
	public void print()
	{
		for(Node current:adjacencyList.keySet())
		{
			System.out.println(current.data);
			List<Node> temp=adjacencyList.get(current);
			System.out.println("Total number of neighbours for: "+ current.data +" is: "+ temp.size());
			for(Node neighbour:temp)
			{
				System.out.println(" " + neighbour.data);
			}
		}

	}
	
	public void connectNodes(Node n1,Node n2)
	{
		List<Node> temp=adjacencyList.get(n1);
		temp.add(n2);
		
	}

}
