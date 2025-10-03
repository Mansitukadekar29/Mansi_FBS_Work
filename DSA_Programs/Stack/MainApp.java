//singleton

package s1;
public class MainApp {
   
	public static void main(String[] args) {
	MainApp myapp=new MainApp();
	
	myapp.insert(50);
	
		
	}
	
	public void insert(int value) {
		MyStack ref=MyStack.getObject();   
		ref.push(value);
	}
	
	
	public void delete(int value) {
		MyStack ref=MyStack.getObject();
	   ref.pop();
	}
}