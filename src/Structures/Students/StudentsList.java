package Structures.Students;

import java.util.HashMap;
import java.util.Scanner;

public class StudentsList {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> students = new HashMap<String, Integer>();
        Menu menu = new Menu();
        int todo;

        do {
            System.out.println("What you want to do?");
            System.out.println("1. Watch the list of the students");
            System.out.println("2. Add the student to the list");
            System.out.println("3. Find the student in the list ");
            System.out.println("4. Remove the student from the list");
            System.out.println("5. Exit");

            todo = scanner.nextInt();

            switch (todo) {
                case 1:
                    menu.showTheList(students);
                    break;
                case 2:
                    menu.addStudents(students);
                    break;
                case 3:
                    menu.searchStudent(students);
                    break;
                case 4:
                    menu.removeStudent(students);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        } while (todo != 5);

        scanner.close();
    }
}
