package s1;

public class MyStack {
	   
		int top;
	    private int [] myStack;
		 static int size;
		 static MyStack ref;
		private MyStack(int size) {
			
			this.top = -1;
			this.size = size;
			this.myStack = new int [size];
		
		}
		
		public static MyStack getObject() {
			if(ref==null) {
				ref=new MyStack(5);
			}
			
			return ref;
		}
		
		
		public boolean isFull() {
			if(top==size-1) 
				return true;
				else
					return false;
			}
		
		public boolean isEmpty() {
			if(top==-1)
				return true;
			else
				return false;
		}
		
		public void push(int ele) {
			if(isFull()) {
				System.out.println("Stack overflow");
			}
			else {
				myStack[++top]=ele;
				System.out.println("Data inserted..:" +ele);
			}
		}
		
		public void pop() {
			if(isEmpty()) {
				System.out.println("Stack underflow");
			}
			else {
			   System.out.println(myStack[top--]+" element popped..");
				
			}
		}
		
		public void peek() {
			if(isEmpty()) {
				System.out.println("stack underflow");
			}
			else {
				System.out.println(myStack[top]+"is on the top");
			}
		}
		
		
		public void display() {
			if(isEmpty()) {
				System.out.println("Stack underflow");
			}
			else {
				for(int i=0;i<=top;i++) {
					System.out.println("\t"+myStack[i]);
				}
			}
		}
		
}