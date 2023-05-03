package String;
import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = str.nextLine();

        System.out.println("Length: "+ input.length());
        System.out.println("First char: "+input.charAt(0));
    }
}
