package p2;

import java.util.Scanner;
import p1.Node;   

public class Student {
    Node Start;
    Node end;

    // Insert Student at End
    void insert(Node ref) {
        if (Start == null) {
            end = ref;
            Start = ref;
        } else {
            end.next = ref;
            ref.pre = end;
            end = ref;
        }
    }

    // Display Forward
    void display() {
        if (Start == null) {
            System.out.println("List is empty");
        } else {
            Node itr = Start;
            while (itr != null) {
                System.out.print("[" + itr.getData() + "] -> ");
                itr = itr.next;
            }
            System.out.println("null");
        }
    }

    // Search by Roll No
    void search(int roll) {
        Node itr = Start;
        while (itr != null) {
            if (itr.rollno == roll) {
                System.out.println("Record Found: " + itr.getData());
                return;
            }
            itr = itr.next;
        }
        System.out.println("Record not found for Roll No: " + roll);
    }

    // Delete by Roll No
    void deleteByRoll(int roll) {
        if (Start == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = Start;

        // If deleting first node
        if (current.rollno == roll) {
            if (current.next != null) {
                Start = current.next;
                Start.pre = null;
            } else {
                Start = null;
                end = null;
            }
            System.out.println("Record deleted for Roll No: " + roll);
            return;
        }

        // Traverse to find node
        while (current != null && current.rollno != roll) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Record not found for Roll No: " + roll);
        } else {
            // If last node
            if (current.next == null) {
                end = current.pre;
                end.next = null;
            } else {
                current.pre.next = current.next;
                current.next.pre = current.pre;
            }
            System.out.println("Record deleted for Roll No: " + roll);
        }
    }

    // Main Menu
    public static void main(String[] args) {
        Student d1 = new Student();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Record Menu ---");
            System.out.println("1. Insert Student");
            System.out.println("2. Delete Student (by Roll No)");
            System.out.println("3. Search Student (by Roll No)");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    d1.insert(new Node(roll, marks, name));
                    break;

                case 2:
                    System.out.print("Enter Roll No to Delete: ");
                    int delRoll = sc.nextInt();
                    d1.deleteByRoll(delRoll);
                    break;

                case 3:
                    System.out.print("Enter Roll No to Search: ");
                    int searchRoll = sc.nextInt();
                    d1.search(searchRoll);
                    break;

                case 4:
                    d1.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}