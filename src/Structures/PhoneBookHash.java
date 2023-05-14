package Structures;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookHash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of contacts: ");
        int numOfContacts = scanner.nextInt();
        scanner.nextLine();

        HashMap<Integer, String> contacts = new HashMap<>();
        for(int i = 0; i < numOfContacts; i++){
            System.out.print("Enter the name of the contact: ");
            String name = scanner.nextLine();
            System.out.print("Enter the phone number of the contact: ");
            int phoneNum = scanner.nextInt();
            scanner.nextLine();

            contacts.put(phoneNum, name);
        }
        System.out.print("Enter the phone number of the contact you are looking for: ");
        int phoneNum = scanner.nextInt();
        System.out.print("Contact name: " + contacts.get(phoneNum));
    }
}
