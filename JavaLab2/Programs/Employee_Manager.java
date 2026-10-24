class Employee {
    int id = 101;
    String name = "Rahul";

    void accept() {
        System.out.println("Employee details accepted");
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

class Manager extends Employee {
    String department = "CSE";
    int teamSize = 10;

    void accept() {
        super.accept();
        System.out.println("Manager details accepted");
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}

public class Employee_Manager {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.accept();
        m.display();
    }
}