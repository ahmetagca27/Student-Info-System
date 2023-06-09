public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    // Constructor
    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    // Methods

    // Method to add exam notes for each course
    void addBulkExamNote(double note1, double note2, double note3, double sNote1, double sNote2, double sNote3) {
        // Check if the notes are within the valid range (0-100) and assign them to the respective courses
        if (note1 >= 0 && note1 <= 100)
            this.course1.note = note1;

        if (note2 >= 0 && note2 <= 100)
            this.course2.note = note2;

        if (note3 >= 0 && note3 <= 100)
            this.course3.note = note3;

        if (sNote1 >= 0 && sNote1 <= 100)
            this.course1.sNote = sNote1;

        if (sNote2 >= 0 && sNote2 <= 100)
            this.course2.sNote = sNote2;

        if (sNote3 >= 0 && sNote3 <= 100)
            this.course3.sNote = sNote3;
    }

    // Method to determine if the student passes or fails
    void isPass() {
        System.out.println("--------------------------------------");
        System.out.println(name);

        // Calculate the weighted average for each course
        double course1 = (this.course1.sNote * 0.20) + (this.course1.note * 0.80);
        double course2 = (this.course2.sNote * 0.20) + (this.course2.note * 0.80);
        double course3 = (this.course3.sNote * 0.20) + (this.course3.note * 0.80);

        // Calculate the overall average
        this.average = (course1 + course2 + course3) / 3.0;
        printNote();

        // Check if the average is above the passing threshold (55)
        if (this.average > 55) {
            System.out.println("Passed the class.");
            this.isPass = true;
        } else {
            System.out.println("Failed the class.");
            this.isPass = false;
        }
    }

    // Method to print the exam notes and average
    void printNote() {
        System.out.println(this.course1.name + " exam grade: " + this.course1.note + " oral grade: " + this.course1.sNote);
        System.out.println(this.course2.name + " exam grade: " + this.course2.note + " oral grade: " + this.course2.sNote);
        System.out.println(this.course3.name + " exam grade: " + this.course3.note + " oral grade: " + this.course3.sNote);
        System.out.println("Your average: " + this.average);
    }
}
