import java.util.ArrayList;

class Test {

	public static void main(String[] args) {
		
		ArrayList <String> a1 = new <String> ArrayList();//allowed only String here
//		a1.add(10);
//		a1.add(30);
//		a1.add(20);
//		a1.add(40);
		a1.add("Mansi");
		a1.add("Mrunmayee");
		a1.add("Akanksha");
		a1.add("Aboli");
//		a1.add(40);//for this string not applicable 
		System.out.println(a1);//toString is present

	for(int i=0;i<a1.size();i++) 
	{
		String str=(String)a1.get(i);
		System.out.println(str.charAt(i));
		System.out.println(a1.get(i));//downcasting 
	}
	
  }
}
