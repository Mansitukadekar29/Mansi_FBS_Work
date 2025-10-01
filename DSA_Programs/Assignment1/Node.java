package p1;

public class Node {
    public int rollno;
    int marks;
    String name;
    public Node next;   
    public Node pre;    

   
    public Node() {
        super();
    }

    
    public Node(int rollno, int marks, String name) {
        super();
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
        this.next = null;
        this.pre = null;
    }

    
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return rollno + " | " + name + " | " + marks;
    }
}