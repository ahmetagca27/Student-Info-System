public class Course {
    Teacher teacher; // Instance variable to store the teacher of the course
    String name; // Name of the course
    String code; // Code of the course
    String prefix; // Prefix of the course
    double note; // Note of the course
    double sNote; // Scaled note of the course

    // Constructor to initialize the Course object
    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0.0;
        this.sNote = 0.0;
    }

    // Method to add a teacher to the course
    void addTeacher(Teacher teacher) {
        // Check if the teacher's branch matches the course's prefix
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Teacher/Course mismatch!");
        }
    }

    // Method to print the details of the teacher
    void printTeacher() {
        this.teacher.print();
    }
}
