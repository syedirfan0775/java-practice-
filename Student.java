public class Student {

    String name;
    int rollNo;
    String branch;

    Student(String name, int rollNo, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
    }

    void display() {
        System.out.println("Student name = " + name);
        System.out.println("Student rollNo = " + rollNo);
        System.out.println("Student Branch = " + branch);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Irfan", 101, "CSE");
        s1.display();
    }
}