abstract class Employee {
    int employeeId;
    String name;

    Employee(int id, String n) {
        employeeId = id;
        name = n;
    }

    abstract int calculatePerformanceScore();

    void display() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Score: " + calculatePerformanceScore());
    }
}

class Developer extends Employee {
    int projects;

    Developer(int id, String n, int p) {
        super(id, n);
        projects = p;
    }

    int calculatePerformanceScore() {
        return projects * 10;
    }
}

class Manager extends Employee {
    int teamScore;

    Manager(int id, String n, int score) {
        super(id, n);
        teamScore = score;
    }

    int calculatePerformanceScore() {
        return teamScore;
    }
}

public class Employe_abstract {
    public static void main(String[] args) {
        Developer d = new Developer(101, "Rahul", 5);
        Manager m = new Manager(102, "Priya", 80);

        System.out.println("Developer Details:");
        d.display();

        System.out.println("\nManager Details:");
        m.display();
    }
}