package p1;

import java.util.TreeMap;

class MyKey implements Comparable {
	int key;
	public MyKey(int key) {
		this.key = key;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n key:->" + this.key;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		MyKey mk = (MyKey) o;
		return this.key - mk.key;
	}
}//class MyKey ends here

class GhoDaGadi {
	int number;
	String name;

	GhoDaGadi() {
		number = 101;
		name = "Not given";
	}

	public GhoDaGadi(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Value:-> Name " + name + " | Number " + this.number;
	}
}//class Ghodagadi ends here

public class TestDemoMap {

	public static void main(String[] args) {

		TreeMap tm = new TreeMap();
		tm.put(new MyKey(45), new GhoDaGadi(45, "Rohit"));
		tm.put(new MyKey(18), new GhoDaGadi(18, "Virat"));
		tm.put(new MyKey(10), new GhoDaGadi(10, "Sachin"));

		System.out.println(tm);
	}

}