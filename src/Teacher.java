public class Teacher {

    String name;
    String mpno;
    String branch;

    // Constructor
    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    // Methods

    // Method to print the teacher's information
    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone Number: " + this.mpno);
        System.out.println("Branch: " + this.branch);
    }
}
