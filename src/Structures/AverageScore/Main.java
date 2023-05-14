package Structures.AverageScore;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numOfStudents = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 0; i < numOfStudents; i++){
            System.out.println("Enter tne name of the student: ");
            String name = scanner.nextLine();
            System.out.println("Enter tne average score of the student: ");
            int averageScore = scanner.nextInt();
            scanner.nextLine();
            students.add(new Student(name, averageScore));
        }

        for(int i = 0; i < students.size(); i++){
            for(int j = i+1; j < students.size(); j++){
                if(students.get(i).getAverageScore() < students.get(j).getAverageScore()){
                    Student tmp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, tmp);

                }
            }

        }

        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getAverageScore());
        }


    }
}
