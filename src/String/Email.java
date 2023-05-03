package String;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email: ");
        String str = scanner.nextLine();

        if(!str.contains("@")){
            System.out.println("Email is invalid");
        }
        else {System.out.println("Email is valid");}
    }
}
