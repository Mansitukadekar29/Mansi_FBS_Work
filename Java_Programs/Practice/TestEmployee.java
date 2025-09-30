import java.util.ArrayList;

class Employee {
    int id;
    String name;
    double salary;

    public Employee() {}

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return this.id == e.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> a1 = new ArrayList<>();

        a1.add(new Employee(101, "Sachin", 20000));
        a1.add(new Employee(11, "Dhoni", 200000));
        a1.add(new Employee(22, "Virat", 60000));

        System.out.println("Employee List: " + a1);

        if (a1.contains(new Employee(11, "Dhoni", 200000))) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
