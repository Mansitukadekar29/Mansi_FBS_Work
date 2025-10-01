package Q1;

import java.util.Arrays;

public class MyQueue {
  int start=-1;
  int end=-1;
  int []queue;
  int size;
  
  public MyQueue() {
	
}

public MyQueue(int size) {
	super();
	this.size = size;
	this.queue=new int[size];
}

public int getStart() {
	return start;
}

public void setStart(int start) {
	this.start = start;
}

public int getEnd() {
	return end;
}

public void setEnd(int end) {
	this.end = end;
}

public int[] getQueue() {
	return queue;
}

public void setQueue(int[] queue) {
	this.queue = queue;
}

public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}

@Override
public String toString() {
	return "MyQueue [start=" + start + ", end=" + end + ", queue=" + Arrays.toString(queue) + ", size=" + size + "]";
}

public void insert(int ele)
{
	if(start==-1 && end==-1)
	{
		queue[++start]=ele; 
		end++;
	}
	else {
		queue[++end]=ele;
	}
}

public int retrieve() {
	return queue[++end];
}

 void display() {
	for(int i=start;i<=end;i++) {
		System.out.println("\t"+queue[i]);
	}
}
  
}
