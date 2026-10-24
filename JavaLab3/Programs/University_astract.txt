abstract class Student {
    String name;
    int usn;

    Student(String n, int u) {
        name = n;
        usn = u;
    }

    abstract void writeExam();

    void display() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        writeExam();
        System.out.println();
    }
}

class EngineeringStudent extends Student {
    EngineeringStudent(String n, int u) {
        super(n, u);
    }

    void writeExam() {
        System.out.println("Engineering student writes exam.");
    }
}

class MedicalStudent extends Student {
    MedicalStudent(String n, int u) {
        super(n, u);
    }

    void writeExam() {
        System.out.println("Medical student writes exam.");
    }
}

public class University_astract {
    public static void main(String[] args) {
        EngineeringStudent e =
            new EngineeringStudent("Rahul", 101);

        MedicalStudent m =
            new MedicalStudent("Priya", 102);

        System.out.println("Engineering Student:");
        e.display();

        System.out.println("Medical Student:");
        m.display();
    }
}