package method;

import java.util.Scanner;

//refactor the program so that each menu option is a separate method.
// For example, create methods like addStudent(), enterGrade(), viewStudentInfo(), and showMenu().
// Then, call these methods from main instead of writing all logic there
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String studentName = "";
        int studentGrade = -1;
        boolean exit = false;

        while (!exit) {
            showMenu();
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    studentName = addStudent(sc);
                    break;

                case "2":
                    studentGrade = enterGrade(studentName, sc);
                    break;

                case "3":
                    showInfo(studentName, studentGrade);
                    break;

                case "4":
                    exit = true;
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-4.");
                    break;
            }
        }

        sc.close();
    }
    public static void showMenu() {
        System.out.println("--- Student Grade Management Menu ---");
        System.out.println("1. Add Student");
        System.out.println("2. Enter Grade");
        System.out.println("3. View Student Info");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }
    public static String addStudent(Scanner sc){
        String studentName="";
        boolean validName = false;
        while (!validName) {
            System.out.print("Enter student name: ");
            String inputName = sc.nextLine().trim();
            if (!inputName.isEmpty()) {
                studentName = inputName;
                validName = true;
                System.out.println("Student added successfully!");
            } else {
                System.out.println("Invalid name! Please enter a non-empty name.");
            }
        }
        return studentName;
    }
    public static int enterGrade(String studentName, Scanner sc) {
        int studentGrade = 0;
        if (studentName.isEmpty()) {
            System.out.println("No student added yet!");
        } else {
            boolean validGrade = false;
            while (!validGrade) {
                System.out.print("Enter grade for " + studentName + " (0-100): ");
                String input = sc.nextLine();
                try {
                    int grade = Integer.parseInt(input);
                    if (grade >= 0 && grade <= 100) {
                        studentGrade = grade;
                        validGrade = true;
                        System.out.println("Grade recorded successfully!");
                    } else {
                        System.out.println("Invalid grade! Must be 0-100.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Enter a number between 0-100.");
                }
            }
        }
        return studentGrade;
    }

    public static void showInfo(String studentName, int studentGrade) {
        if (studentName.isEmpty()) {
            System.out.println("No student info available.");
        } else {
            System.out.println("Student Name: " + studentName);
            if (studentGrade == -1) {
                System.out.println("Grade: Not entered yet");
            } else {
                System.out.println("Grade: " + studentGrade);
            }
        }
    }
}