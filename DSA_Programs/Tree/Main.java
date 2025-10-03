package t1;

public class Main {

	Node root;
	public static void main(String[] args) {
		
		Main add=new Main();
		add.insert(33);
		add.insert(45);
		add.insert(7);
		add.insert(9);
		add.insert(18);
		add.insert(25);
		add.insert(55);
		
		add.inOrder();
		add.preOrder();
		add.postOrder();
			
	}
	 void insert(int value) {
		root = insertValue(root,value);
				
	}
	 
	 Node insertValue(Node root, int value) {
	if(root == null) 
	{
	  root = new Node(value);
	  return root;
	  
	}
	
	if(value < (root.data))
	{
		root.left = insertValue(root.left,value);
		
		
	}
	else
		if(value > (root.data))
		{
			root.right = insertValue(root.right,value);
		}
		return root;
	}
	
	
	public void inOrder()
	{
		System.out.println("Inorder tree is:");
		inOrderTree(root);
	}
	
	public void preOrder()
	{
		System.out.println("Preorder tree is:");
		preOrderTree(root);
	}
	
	public void postOrder()
	{
		System.out.println("Postorder tree is:");
		postOrderTree(root);
	}
	
	void inOrderTree(Node root) {
		if(root != null)
		{
			inOrderTree(root.left);
			System.out.println(root.data);
			inOrderTree(root.right);
		}
		
	}
	
	void preOrderTree(Node root)
	{
		if(root != null)
		{
			preOrderTree(root.left);
			preOrderTree(root.right);
			System.out.println(root.data);
		}
	}
	
	void postOrderTree(Node root)
	{
		if(root != null)
		{
			System.out.println(root.data);
			postOrderTree(root.left);
			postOrderTree(root.right);
			
		}
	}
	
}
