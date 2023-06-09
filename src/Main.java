import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create teachers
        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "TRH");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Kül Yutmaz", "90550000002", "BIO");

        // Create courses
        Course history = new Course("History", "101", "TRH");
        history.addTeacher(t1);

        Course physics = new Course("Physics", "102", "FZK");
        physics.addTeacher(t2);

        Course biology = new Course("Biology", "103", "BIO");
        biology.addTeacher(t3);

        // Create students
        Student s1 = new Student("İnek Şaban", "140144015", "4", history, physics, biology);
        s1.addBulkExamNote(100, 50, 40, 90, 90, 90);

        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "2211133", "4", history, physics, biology);
        s2.addBulkExamNote(50, 20, 40, 50, 100, 100);

        s2.isPass();
    }
}
