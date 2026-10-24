class Employee {
    final String company = "ABC Company";

    final void policy() {
        System.out.println("Follow company rules");
    }

    void display() {
        System.out.println("Company Name: " + company);
        policy();
    }
}

public class final1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}