package Structures.Students;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private boolean isFirstCall = true;
    void showTheList(HashMap<String, Integer> list){
        if(list.isEmpty()){
            System.out.println("The list is empty");
        } else{
            for(String name : list.keySet()){
            System.out.println(name + " - "+ list.get(name));
            }
        }

    }

    void addStudents(HashMap<String, Integer> list) {
        if (!isFirstCall) {
            scanner.nextLine();
        }
        System.out.println("Add student's name: ");
        String name = scanner.nextLine();
        isFirstCall = false;
        System.out.println("Add student's score: ");
        Integer score = scanner.nextInt();
        list.put(name, score);
    }

    void searchStudent(HashMap<String, Integer> list){
        if (!isFirstCall) {
            scanner.nextLine();
        }
        if(list.isEmpty()){
            System.out.println("The list is empty");
        }
        System.out.println("Enter student's name: ");
        String name = scanner.nextLine();
        isFirstCall = false;
        if (list.containsKey(name)) {
            System.out.println("Score: " + list.get(name));
        } else {
            System.out.println("THe student is not founded");
        }

    }

    void removeStudent(HashMap<String, Integer> list){
        if (!isFirstCall) {
            scanner.nextLine();
        }
        if(list.isEmpty()){
            System.out.println("The list is empty");
        }
        System.out.println("Enter student's name: ");
        String name = scanner.nextLine();
        isFirstCall = false;
        list.remove(name);
    }
}
