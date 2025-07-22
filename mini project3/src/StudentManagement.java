import java.util.Scanner;

// User-defined exception for invalid marks
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}

// Student class with attributes
class Student {
    String name;
    int rollNumber;
    int marks;

    public Student(String name, int rollNumber, int marks) throws InvalidMarkException {
        this.name = name;
        this.rollNumber = rollNumber;
        setMarks(marks);
    }

    public void setMarks(int marks) throws InvalidMarkException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarkException("Marks should be between 0 and 100.");
        }
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Marks: " + marks);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.nextLine());

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            try {
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter roll number: ");
                int roll = Integer.parseInt(sc.nextLine());

                System.out.print("Enter marks: ");
                int marks = Integer.parseInt(sc.nextLine());

                students[i] = new Student(name, roll, marks);

            } catch (InvalidMarkException e) {
                System.out.println("Error: " + e.getMessage());
                i--; // retry same student
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format.");
                i--; // retry same student
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
                i--; // retry same student
            }
        }

        // Display all student details
        System.out.println("\nAll Student Details:");
        for (Student s : students) {
            s.displayDetails();
        }
    }
}
